package com.hack.cp.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import com.hack.cp.Data.TestData;
import com.hack.cp.Data.TestDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private TestDataServices service;


    @GetMapping("/")
    public List<TestData> read() {
        return service.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestData> read(@PathVariable("id") Long id) {
        TestData foundStudent = service.read(id);
        if (foundStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundStudent);
        }

    }

    @PostMapping("/")
    public ResponseEntity<TestData> create(@RequestBody TestData student) throws URISyntaxException {
        TestData createdStudent = service.create(student);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdStudent);

    }

    @PutMapping("/{id}")
    public ResponseEntity<TestData> update(@RequestBody TestData student, @PathVariable Long id) {
        TestData updatedStudent = service.update(id, student);
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
