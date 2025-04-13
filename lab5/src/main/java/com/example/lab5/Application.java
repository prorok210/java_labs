package com.example.lab5;

import com.example.lab5.config.AppConfig;
import com.example.lab5.model.Cat;
import com.example.lab5.model.PetShop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получение PetShop, сконфигурированного через XML
        PetShop xmlPetShop = context.getBean("xmlPetShop", PetShop.class);
        
        System.out.println("\n1. ЗООМАГАЗИН, СКОНФИГУРИРОВАННЫЙ ЧЕРЕЗ XML");
        System.out.println("----------------------------------");
        System.out.println("Название: " + xmlPetShop.getName());
        System.out.println("\nИнформация о кошке (внедрена через XML):");
        System.out.println(xmlPetShop.getCatInfo());
        System.out.println("\nИнформация о попугае (внедрен через @Autowired):");
        System.out.println(xmlPetShop.getParrotInfo());
        System.out.println("\nИнформация о рыбке (ещё не внедрена):");
        System.out.println(xmlPetShop.getFishInfo());
        System.out.println("\nДоступные животные:");
        System.out.println(xmlPetShop.displayAllAnimals());
        
        // Получение PetShop, сконфигурированного через Java
        PetShop javaPetShop = context.getBean("javaPetShop", PetShop.class);
        
        System.out.println("\n2. ЗООМАГАЗИН, СКОНФИГУРИРОВАННЫЙ ЧЕРЕЗ JAVA");
        System.out.println("----------------------------------");
        System.out.println("Название: " + javaPetShop.getName());
        System.out.println("\nИнформация о кошке (не внедрена):");
        System.out.println(javaPetShop.getCatInfo());
        System.out.println("\nИнформация о попугае (внедрен через @Autowired):");
        System.out.println(javaPetShop.getParrotInfo());
        System.out.println("\nИнформация о рыбке (внедрена через Java-конфигурацию):");
        System.out.println(javaPetShop.getFishInfo());
        
        // Демонстрация других методов
        System.out.println("\n3. ЗВУКИ ЖИВОТНЫХ (ИЗ XML-ЗООМАГАЗИНА)");
        System.out.println("----------------------------------");
        System.out.println(xmlPetShop.makeAllAnimalSounds());
        
        System.out.println("\n4. ОПИСАНИЯ ЖИВОТНЫХ (ИЗ JAVA-ЗООМАГАЗИНА)");
        System.out.println("----------------------------------");
        System.out.println(javaPetShop.getAllAnimalDescriptions());
        
        // Создание полностью внедренного зоомагазина для демонстрации всех трех типов внедрения
        PetShop combinedPetShop = context.getBean("javaPetShop", PetShop.class);
        combinedPetShop.setName("Полностью Внедренный Зоомагазин");
        // Получение кошки напрямую из контекста
        combinedPetShop.setCat(context.getBean("cat", Cat.class));
        
        System.out.println("\n5. ПОЛНОСТЬЮ ВНЕДРЕННЫЙ ЗООМАГАЗИН (ВСЕ 3 ТЕХНИКИ)");
        System.out.println("----------------------------------");
        System.out.println("Название: " + combinedPetShop.getName());
        System.out.println("Кошка (XML) + Рыбка (Java) + Попугай (@Autowired)");
        System.out.println(combinedPetShop.makeAllAnimalSounds());
        
        // Закрытие контекста
        context.close();
    }
}