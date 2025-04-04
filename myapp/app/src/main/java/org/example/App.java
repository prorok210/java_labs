/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        ClassPathXmlApplicationContext context1 =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean testBean1 = context1.getBean("Bean", Bean.class);

        System.out.println(testBean1.getName());

        context1.close();

        AnnotationConfigApplicationContext context2 =
            new AnnotationConfigApplicationContext(SpringConfig.class);

        Bean testBean2 = context2.getBean("BeanClass", Bean.class);

        System.out.println(testBean2.getName());

        CatBean cat = context2.getBean("CatBean", CatBean.class);
        System.out.println(cat.toString());
        cat.sounds();

        ParrotBean parrot = context2.getBean("ParrotBean", ParrotBean.class);
        System.out.printf(
            "Age: %d, Color: %s",
            parrot.getAge(),
            parrot.getColor()
        );
        parrot.sounds();

        FishBean fish = context2.getBean("FishBean", FishBean.class);
        System.out.printf("Age: %s, Kind: %s", fish.getAge(), fish.getKind());
        fish.sounds();

        context2.close();
    }
}
