package com.example.lab5.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class PetShop {
    private String name;
    
    private Cat cat;
    
    private Fish fish;
    
    @Autowired
    @Qualifier("parrot")
    private Parrot parrot;
    
    private List<Animal> availableAnimals;
    
    public PetShop() {
        this.name = "Default Pet Shop";
    }
    
    public PetShop(String name) {
        this.name = name;
    }
    
    public void setCat(Cat cat) {
        this.cat = cat;
    }
    
    public void setFish(Fish fish) {
        this.fish = fish;
    }
    
    public void setAvailableAnimals(List<Animal> availableAnimals) {
        this.availableAnimals = availableAnimals;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String displayAllAnimals() {
        if (availableAnimals == null || availableAnimals.isEmpty()) {
            return "No animals available in the pet shop.";
        }
        
        StringBuilder result = new StringBuilder();
        result.append("Animals available at ").append(name).append(":\n");
        
        for (Animal animal : availableAnimals) {
            result.append("- ").append(animal.toString()).append("\n");
        }
        
        return result.toString();
    }
    
    public String getCatInfo() {
        return cat != null ? 
                "Cat information from " + name + ": " + cat.toString() : 
                "No cat available.";
    }
    
    public String getFishInfo() {
        return fish != null ? 
                "Fish information from " + name + ": " + fish.toString() : 
                "No fish available.";
    }
    
    public String getParrotInfo() {
        return parrot != null ? 
                "Parrot information from " + name + ": " + parrot.toString() : 
                "No parrot available.";
    }
    
    public String makeAllAnimalSounds() {
        StringBuilder result = new StringBuilder();
        result.append("Sounds of animals in ").append(name).append(":\n");
        
        if (cat != null) {
            result.append("- Cat says: ").append(cat.makeSound()).append("\n");
        }
        
        if (fish != null) {
            result.append("- Fish says: ").append(fish.makeSound()).append("\n");
        }
        
        if (parrot != null) {
            result.append("- Parrot says: ").append(parrot.makeSound()).append("\n");
        }
        
        return result.toString();
    }
    
    public String getAllAnimalDescriptions() {
        StringBuilder result = new StringBuilder();
        result.append("Descriptions of animals in ").append(name).append(":\n");
        
        if (cat != null) {
            result.append("- Cat: ").append(cat.getDescription()).append("\n");
        }
        
        if (fish != null) {
            result.append("- Fish: ").append(fish.getDescription()).append("\n");
        }
        
        if (parrot != null) {
            result.append("- Parrot: ").append(parrot.getDescription()).append("\n");
        }
        
        return result.toString();
    }
}