package com.example;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, "Persik");
        System.out.println(cat.toString());
        cat.sounds();

        Parrot parrot = new Parrot("Kesha", 2, "Multicolor");
        System.out.printf("Age: %d, Color: %s", parrot.getAge(), parrot.getColor());
        parrot.sounds();

        Fish fish = new Fish("Karas", 20, "Carpovie");
        System.out.printf("Age: %s, Kind: %s", fish.getAge(), fish.getKind());
        fish.sounds();
    }
}
