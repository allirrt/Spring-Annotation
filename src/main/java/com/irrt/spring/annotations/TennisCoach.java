package com.irrt.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    @Qualifier("randomFortuneService")
    @Autowired

    private FortuneService fortuneService;

//    public TennisCoach() {
//        this.fortuneService = fortuneService;
//    }

//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //    public void crazyStaff(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
    @PostConstruct
    public void initMethod() {
        System.out.println("Проведена инициализация бина");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("Запущен preDestroyMethod");
    }


    @Override
    public String getDailyWorkout() {
        return "Играем в теннис";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
