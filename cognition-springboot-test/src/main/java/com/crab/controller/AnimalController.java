package com.crab.controller;

import com.crab.service.AnimalService;
import com.crab.service.BirdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalService animalService;
    private final BirdService birdService;

    public AnimalController(AnimalService animalService, BirdService birdService) {
        this.animalService = animalService;
        this.birdService = birdService;
    }

    @GetMapping("/")
    public String animal() {
        animalService.doing();
        return "animal";
    }

    @GetMapping("/bird")
    public String bird() {
        birdService.doing();
        return "bird";
    }
}
