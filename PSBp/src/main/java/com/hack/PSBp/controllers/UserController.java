package com.hack.PSBp.controllers;

import com.hack.PSBp.domain.UserPSB;
import com.hack.PSBp.repos.UserPsbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;


@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserPsbRepo service;


//    @GetMapping("/")
//    public List<UserPSB> read() {
//        return service.findAll();
//    }
    @GetMapping("/")
    public Iterable<UserPSB> read() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserPSB> read(@PathVariable("id") Long id) {
        Optional<UserPSB> foundUser = service.findById(id);
        UserPSB user = foundUser.isPresent() ? foundUser.get() : new UserPSB();

        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(user);
        }

    }

    @PostMapping("/")
    public ResponseEntity<UserPSB> create(@RequestBody UserPSB user) throws URISyntaxException {
        UserPSB createdUser = service.save(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(createdUser);

    }

    @PutMapping("/{id}")
    public ResponseEntity<UserPSB> update(@RequestBody UserPSB student, @PathVariable Long id) {
        student.setId(id);
        UserPSB updatedStudent = service.save( student);
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
