package com.example;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void sounds() {
        System.out.println("Мяу");
    }
}
