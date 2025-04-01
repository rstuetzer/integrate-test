package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ideas")
public class IdeaController {

    @Autowired
    private IdeaRepository ideaRepository;

    @PostMapping
    public Idea createIdea(@RequestBody Idea idea) {
        return ideaRepository.save(idea);
    }

    @GetMapping
    public List<Idea> getAllIdeas() {
        return ideaRepository.findAll();
    }
}