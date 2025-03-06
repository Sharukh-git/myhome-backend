package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000","https://myhome.vercel.app")  // Allow frontend access
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/user")
    public User getUser() {
        return new User("John Doe", 30, "john@example.com");
    }
}
