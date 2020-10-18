package com.example.demo.Magazine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MagazineConfig.class);

        ApplicationContext applicationContext1 =
                new ClassPathXmlApplicationContext("application.xml");

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        MagazineService magazineService = (MagazineService) applicationContext.getBean("magazineService");
        System.out.println(magazineService.magazineRepository != null);
    }
}
