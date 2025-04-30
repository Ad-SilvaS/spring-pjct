package com.project.spbt.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spbt.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u2 = new User(12323232L, "John", "jj.a@mail.com", "224442-3333", "sksdjdshd");

        return ResponseEntity.ok().body(u2);
    }
}
