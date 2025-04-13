package com.example.lab4;

import com.example.lab4.config.AppConfig;
import com.example.lab4.model.Animal;
import com.example.lab4.model.Zoo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    public static void main(String[] args) {
        // Initialize Spring IoC container using Java-based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Get the Zoo bean which has animals injected into it
        Zoo zoo = context.getBean("zoo", Zoo.class);
        
        // Display information about the zoo and its animals
        System.out.println("=== Zoo Information ===");
        System.out.println(zoo.getAnimalCount());
        System.out.println();
        
        // Display all animals in the zoo
        System.out.println(zoo.displayAllAnimals());
        
        // Make all animals produce their sounds
        System.out.println(zoo.makeAllAnimalsSounds());
        
        // Demonstrating accessing individual animals through the zoo
        System.out.println("=== Individual Animal Details ===");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal.getDescription());
        }
        
        // Close the context
        context.close();
    }
}