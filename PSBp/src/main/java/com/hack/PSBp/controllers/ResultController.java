package com.hack.PSBp.controllers;

import com.hack.PSBp.domain.Result;
import com.hack.PSBp.repos.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultRepo service;

    @GetMapping("/")
    public Iterable<Result> read() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> read(@PathVariable("id") Long id) {
        Optional<Result> foundResult = service.findById(id);
        Result result = foundResult.isPresent() ? foundResult.get() : new Result();
        if (foundResult == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }

    }

    @PostMapping("/")
    public ResponseEntity<Result> create(@RequestBody Result student) throws URISyntaxException {
        Result createdStudent = service.save(student);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdStudent);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Result> update(@RequestBody Result student, @PathVariable Long id) {
        service.deleteById(id);
        student.setId(id);
        Result updatedStudent = service.save( student);
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
