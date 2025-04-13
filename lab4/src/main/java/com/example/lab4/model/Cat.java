package com.example.lab4.model;

public class Cat implements Animal {
    private String name;
    private int age;
    private String furColor;
    
    public Cat() {
        this.name = "Default Cat";
        this.age = 1;
        this.furColor = "Gray";
    }
    
    public Cat(String name, int age, String furColor) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
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
    
    public String getFurColor() {
        return furColor;
    }
    
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    @Override
    public String makeSound() {
        return "Meow!";
    }
    
    @Override
    public String getDescription() {
        return "A " + getFurColor() + " cat that likes to chase mice and sleep.";
    }
    
    @Override
    public String toString() {
        return "Cat {name='" + name + "', age=" + age + ", furColor='" + furColor + "'}";
    }
}