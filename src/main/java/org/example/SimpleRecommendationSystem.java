package org.example;

import java.util.Map;

//В строке 8 выполняется принцип Open Closed
//В строке с 10 до 24 выполняется принцип Single Responsibility

public class SimpleRecommendationSystem implements SimpleRecommendationSystemAble {
    @Override
    public void printStock() {
        String key = null;
        Integer value = 0;
        Products products = new Products();
        products.addProducts();
        for (Map.Entry<String, Integer> entry : products.products.entrySet()) {
            if (entry.getKey().equals("Яйцо")) {
                key = entry.getKey();
                System.out.println("Старая стоимость на товар " + key + " равна " + entry.getValue() + ".");
                value = 60;
            }
        }
        System.out.println("Сегодня акция на товар " + key + "!" + " Рекомендуем купить! Новая цена " + value + "!");
    }
}
