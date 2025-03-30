package org.example;

import java.nio.channels.Pipe;

public class FishBean {

    private String name;
    private int age;
    private String kind;

    public FishBean(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getKind() {
        return this.kind;
    }

    public void sounds() {
        System.out.println("Бульк");
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
