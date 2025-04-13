package com.example.lab5.config;

import com.example.lab5.model.Fish;
import com.example.lab5.model.PetShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {
    
    @Bean
    public Fish javaBeanFish() {
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAge(1);
        fish.setWaterType("Saltwater");
        fish.setSpecies("Clownfish");
        return fish;
    }
    
    @Bean
    public PetShop javaPetShop() {
        PetShop petShop = new PetShop("Java-configured Pet Shop");
        petShop.setFish(javaBeanFish());
        return petShop;
    }
}