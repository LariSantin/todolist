package com.example.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("/health")
    public LocalDateTime getHealth(){
        return LocalDateTime.now();
    }
}
