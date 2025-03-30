package org.example;

import java.nio.channels.Pipe;

public class CatBean {

    private String name;
    private int age;
    private String breed;

    public CatBean(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void sounds() {
        System.out.println("Мяу");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Животное [имя=" + name + ", возраст=" + age + "]";
    }
}
