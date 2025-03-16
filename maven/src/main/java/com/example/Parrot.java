package com.example;

import java.io.IOException;

public class Parrot extends Animal {
    private String color;

    public Parrot(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void sounds() {
        try {
            System.out.println("Скажите что-нибудь и я повторю:");
            byte[] phrase = new byte[100];
            int len = System.in.read(phrase);

            String input = new String(phrase, 0, len - 1);
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}
