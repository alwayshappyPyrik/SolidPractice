package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

//В строке 10 выполняется принцип Open Closed, Interface Segregation
//В строке с 16 по 45 выполняются принцип Single Responsibility

public class Products implements ProductsAble, ProductsFilter {

    Map<String, Integer> products = new HashMap<>();
    long numberProduct = 1;

    @Override
    public void addProducts() {
        products.put("Хлеб", 50);
        products.put("Яйцо", 120);
        products.put("Масло подсолнечное", 100);
        products.put("Гречка", 80);
        products.put("Курица", 300);
    }

    @Override
    public void printAvailableProducts() {
        products.forEach((key, value) -> System.out.println(numberProduct++ + "." + " Название продукта: " + key + " ==>> " + "Цена: " + value));
    }

    @Override
    public void filterProductsByName() {
        addProducts();
        Stream<Map.Entry<String, Integer>> sorted;
        sorted = products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey());
        sorted.forEachOrdered(e -> System.out.printf("Название продукта: %s ==>> Цена: %d%n", e.getKey(), e.getValue()));
    }

    @Override
    public void filterProductsByPrice() {
        addProducts();
        Stream<Map.Entry<String, Integer>> sorted;
        sorted = products.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());
        sorted.forEachOrdered(e -> System.out.printf("Название продукта: %s ==>> Цена: %d%n", e.getKey(), e.getValue()));
    }
}
