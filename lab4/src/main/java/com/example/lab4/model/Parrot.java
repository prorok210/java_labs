package com.example.lab4.model;

public class Parrot implements Animal {
    private String name;
    private int age;
    private String color;
    private boolean canTalk;
    
    public Parrot() {
        this.name = "Default Parrot";
        this.age = 2;
        this.color = "Green";
        this.canTalk = true;
    }
    
    public Parrot(String name, int age, String color, boolean canTalk) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canTalk = canTalk;
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
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isCanTalk() {
        return canTalk;
    }
    
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
    
    @Override
    public String makeSound() {
        return canTalk ? "Hello, world!" : "Squawk!";
    }
    
    @Override
    public String getDescription() {
        return "A " + getColor() + " parrot that " + (canTalk ? "can talk and" : "cannot talk but") + " loves to fly around.";
    }
    
    @Override
    public String toString() {
        return "Parrot {name='" + name + "', age=" + age + ", color='" + color + "', canTalk=" + canTalk + "}";
    }
}