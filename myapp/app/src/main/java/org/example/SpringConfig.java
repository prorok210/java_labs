package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "BeanClass")
    public org.example.Bean getBean() {
        return new org.example.Bean("This is a Bean configurate by class");
    }

    @Bean(name = "CatBean")
    public CatBean getCatBean() {
        return new CatBean("Whiskers", 3, "Siamese");
    }

    @Bean(name = "FishBean")
    public FishBean getFishBean() {
        return new FishBean("Nemo", 2, "Clownfish");
    }

    @Bean(name = "ParrotBean")
    public ParrotBean getParrotBean() {
        return new ParrotBean("Polly", 5, "Green");
    }
}
