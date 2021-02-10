package com.irrt.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);
        Coach bettaCoach = context.getBean("tennisCoach", TennisCoach.class);
        boolean b = (alphaCoach == bettaCoach);
        boolean b1 = alphaCoach.equals(bettaCoach);

        System.out.println(b + " " + b1);
        context.close();


    }
}
