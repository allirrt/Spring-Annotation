package com.irrt.spring.annotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Сегодня грустный день";
    }
}
