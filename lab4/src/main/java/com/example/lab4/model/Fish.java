package com.example.lab4.model;

public class Fish implements Animal {
    private String name;
    private int age;
    private String waterType; // freshwater or saltwater
    private String species;
    
    public Fish() {
        this.name = "Default Fish";
        this.age = 1;
        this.waterType = "Freshwater";
        this.species = "Goldfish";
    }
    
    public Fish(String name, int age, String waterType, String species) {
        this.name = name;
        this.age = age;
        this.waterType = waterType;
        this.species = species;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int getAge() {
        return age;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getWaterType() {
        return waterType;
    }
    
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    @Override
    public String makeSound() {
        return "Blub blub!";
    }
    
    @Override
    public String getDescription() {
        return "A " + getSpecies() + " fish that lives in " + getWaterType() + " water and loves to swim.";
    }
    
    @Override
    public String toString() {
        return "Fish {name='" + name + "', age=" + age + 
               ", species='" + species + "', waterType='" + waterType + "'}";
    }
}