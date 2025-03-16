package com.example;

public class Fish extends Animal {
    private String kind;

    public Fish(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return this.kind;
    }

    public void sounds() {
        System.out.println("Бульк");
    }
}
