package com.example.lab4.config;

import com.example.lab4.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    
    // Animal Beans
    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Whiskers");
        cat.setAge(3);
        cat.setFurColor("Orange");
        return cat;
    }
    
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Polly");
        parrot.setAge(5);
        parrot.setColor("Blue");
        parrot.setCanTalk(true);
        return parrot;
    }
    
    @Bean
    public Fish fish() {
        Fish fish = new Fish();
        fish.setName("Bubbles");
        fish.setAge(2);
        fish.setWaterType("Saltwater");
        fish.setSpecies("Clownfish");
        return fish;
    }
    
    // List of animals to inject into Zoo
    @Bean
    public List<Animal> animalList() {
        return Arrays.asList(cat(), parrot(), fish());
    }
    
    // Zoo bean with injected animals
    @Bean
    public Zoo zoo() {
        return new Zoo(animalList(), "Spring Animal Zoo");
    }
}