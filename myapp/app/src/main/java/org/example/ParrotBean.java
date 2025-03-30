package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Pipe;

public class ParrotBean {

    private String name;
    private int age;
    private String color;

    public ParrotBean(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void sounds() {
        try {
            System.out.println("Скажите что-нибудь и я повторю:");
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
            );
            String input = reader.readLine();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
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
