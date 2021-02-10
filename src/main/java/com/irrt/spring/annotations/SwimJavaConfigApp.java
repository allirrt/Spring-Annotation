package com.irrt.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ConfigSpring.class);
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
        System.out.println("Email: " + coach.getEmail());
        System.out.println("Team: " + coach.getTeam());
        context.close();
    }
}
