package com.example.lab4.model;

import java.util.List;

public class Zoo {
    
    private final List<Animal> animals;
    private String name;
    
    public Zoo(List<Animal> animals, String name) {
        this.animals = animals;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }
    
    public String displayAllAnimals() {
        StringBuilder result = new StringBuilder();
        result.append("Zoo: ").append(name).append(" has the following animals:\n");
        
        for (Animal animal : animals) {
            result.append("- ").append(animal.toString()).append("\n");
        }
        
        return result.toString();
    }
    
    public String makeAllAnimalsSounds() {
        StringBuilder result = new StringBuilder();
        result.append("Sounds of animals in ").append(name).append(":\n");
        
        for (Animal animal : animals) {
            result.append("- ").append(animal.getName())
                  .append(" says: ").append(animal.makeSound()).append("\n");
        }
        
        return result.toString();
    }
    
    public String getAnimalCount() {
        return "The zoo contains " + animals.size() + " animals.";
    }
}