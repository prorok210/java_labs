package gradle;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}