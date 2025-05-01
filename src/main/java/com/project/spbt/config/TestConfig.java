package com.project.spbt.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.spbt.entities.User;
import com.project.spbt.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Anna Henderson", "annh@gmail.com", "555-778", "hssj2h201ksj");
        User u2 = new User(null, "John Stewart", "js@gmail.com", "555-278", "hj2h201ksj");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
