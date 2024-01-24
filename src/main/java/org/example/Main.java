package org.example;

import java.util.Scanner;

// Строки с 11 по 16 говорят нам о принципе Dependency Inversion
// Строки с 18 по 61 говорят нам о принципе Single-responsibility

public class Main {
    public static void main(String[] args) {

        ProductsAble ableProducts = new Products();
        ProductsFilter filterProducts = new Products();
        BasketAble basket = new Basket();
        OrderAble order = new Order();
        RatingAble rating = new Rating();
        SimpleRecommendationSystemAble recommendationSystem = new SimpleRecommendationSystem();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в наш магазин! Выберите любое действие с 1 по 7 или введите end");
            System.out.println("1. Вывод доступных для покупки товаров");
            System.out.println("2. Фильтрация товаров по имени, ценам");
            System.out.println("3. Составление продуктовой корзины пользователя");
            System.out.println("4. Трекинг заказа в системе доставки");
            System.out.println("5. Возврат заказа, повтороение заказа");
            System.out.println("6. Система рейтинга для товаров");
            System.out.println("7. Простая рекомендательная система для покупок");
            String inputLine = scanner.nextLine();
            if (inputLine.equals("end")) {
                break;
            }
            switch (inputLine) {
                case "1" -> {
                    ableProducts.addProducts();
                    ableProducts.printAvailableProducts();
                }
                case "2" -> {
                    System.out.println("Если введете 1 будет отфильтрованно по имени товаров, если введете 2 будет отфильтрованно по цене");
                    int filterNumber = scanner.nextInt();
                    if (filterNumber == 1) {
                        filterProducts.filterProductsByName();
                    } else if (filterNumber == 2) {
                        filterProducts.filterProductsByPrice();
                    }
                }
                case "3" -> basket.creatingAgroceryBasket();
                case "4" -> order.markOrder();
                case "5" -> {
                    System.out.println("Если введете 1 сможете отменить заказ, если введете 2 сможете повторить заказ");
                    int orderNumber = scanner.nextInt();
                    if (orderNumber == 1) {
                        order.refundOrder();
                    } else if (orderNumber == 2) {
                        order.repeatOrder();
                    }
                }
                case "6" -> rating.ratingProducts();
                case "7" -> recommendationSystem.printStock();
            }
        }
    }
}
