package com.hack.PSBp.controllers;

import com.hack.PSBp.domain.Answer;
import com.hack.PSBp.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping("/answer")
public class AnswerСontroller {

    @Autowired
    private AnswerService service;

    @GetMapping("/")
    public List<Answer> read() {
        return service.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> read(@PathVariable("id") Long id) {
        Answer foundStudent = service.read(id);
        if (foundStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundStudent);
        }

    }

    @PostMapping("/")
    public ResponseEntity<Answer> create(@RequestBody Answer student) throws URISyntaxException {
        Answer createdStudent = service.create(student);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdStudent);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Answer> update(@RequestBody Answer student, @PathVariable Long id) {
        Answer updatedStudent = service.update(id, student);
        if (updatedStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(updatedStudent);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Long id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
