package com.hack.PSBp.controllers;

import com.hack.PSBp.domain.Result;
import com.hack.PSBp.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService service;


    @GetMapping("/")
    public List<Result> read() {
        return service.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> read(@PathVariable("id") Long id) {
        Result foundStudent = service.read(id);
        if (foundStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundStudent);
        }

    }

    @PostMapping("/")
    public ResponseEntity<Result> create(@RequestBody Result student) throws URISyntaxException {
        Result createdStudent = service.create(student);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdStudent);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Result> update(@RequestBody Result student, @PathVariable Long id) {
        Result updatedStudent = service.update(id, student);
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
