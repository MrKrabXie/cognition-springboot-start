package com.crab.service;

import com.crab.config.AnimalProperties;

public class AnimalService {
    private AnimalProperties animalProperties;

    public AnimalService(AnimalProperties animalProperties) {
        this.animalProperties = animalProperties;
    }

    public void doing() {
        System.out.println("this is animal service");
        System.out.println("type:" + animalProperties.getType());
        System.out.println("name:" + animalProperties.getName());
    }
}
