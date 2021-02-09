package com.irrt.spring.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] data = {
            "Боррель собирается предложить новые антироссийские санкции после визита в РФ",
            "МВФ рекомендовал ЦБ снизить ключевую ставку ниже 4%",
            "ВОЗ назвала маловероятным заражение COVID-19 напрямую от летучих мышей",
    "«Газпром» остановил транзит газа через Литву в Калининград",
    "Власти РФ запретили ввоз из Украины деталей для железнодорожного транспор"
    };
    private Random random = new Random();



    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
