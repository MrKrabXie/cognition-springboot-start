package com.crab.service;

import com.crab.config.AnimalProperties;

public class BirdService {
    private final AnimalProperties animalProperties;

    public BirdService(AnimalProperties animalProperties) {
        this.animalProperties = animalProperties;
    }

    public void doing() {
        System.out.println("this is bird service");
        System.out.println("type:" + animalProperties.getType());
        System.out.println("name:" + animalProperties.getName());
        System.out.println("doing:" + animalProperties.getBird().getDoing());
    }
}
