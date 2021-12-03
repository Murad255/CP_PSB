package com.hack.PSBp.controllers;

import com.hack.PSBp.domain.Answer;
import com.hack.PSBp.domain.UserPSB;
import com.hack.PSBp.repos.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answer")
public class AnswerСontroller {

    @Autowired
    private AnswerRepo service;

    @GetMapping("/")
    public Iterable<Answer> read() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> read(@PathVariable("id") Long id) {
        Optional<Answer> foundAnswer = service.findById(id);
        Answer answer = foundAnswer.isPresent() ? foundAnswer.get() : new Answer();

        if (answer == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(answer);
        }

    }

    @PostMapping("/")
    public ResponseEntity<Answer> create(@RequestBody Answer student) throws URISyntaxException {
        Answer createdStudent = service.save(student);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdStudent);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Answer> update(@RequestBody Answer student, @PathVariable Long id) {

        student.setId(id);
        Answer updatedStudent = service.save( student);

        if (updatedStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(updatedStudent);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Long id) {
        service.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
