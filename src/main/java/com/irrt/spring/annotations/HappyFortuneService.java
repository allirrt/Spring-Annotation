package com.irrt.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Сегодня твой счастливый день";

    }

}