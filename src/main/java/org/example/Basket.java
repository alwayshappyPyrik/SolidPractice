package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//В строке 10 выполняется принцип Open Closed
//В строках с 11 по 58 Single Responsibility

public class Basket implements BasketAble {
    private List<String> productsBasket = new ArrayList<>();
    private int sumAllPurhases;

    @Override
    public void creatingAgroceryBasket() {
        Products products = new Products();
        products.addProducts();
        products.printAvailableProducts();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Введите имя товара или введите `end`");
            String productName = scanner.nextLine();
            if (productName.equals("end")) {
                break;
            }

            productsBasket.add(productName);
            System.out.println("Выберите количество товара");
            int productCount = Integer.parseInt(scanner.nextLine());
            productsBasket.add(String.valueOf(productCount));
            String currentPrice = String.valueOf(products.products.get(productName));
            productsBasket.add(currentPrice);
            int sumProducts = Integer.parseInt(currentPrice) * productCount;
            productsBasket.add(String.valueOf(sumProducts));
            sumAllPurhases += sumProducts;
        }

        if (productsBasket.isEmpty()) {
            System.out.println("Вы ничего не купили, Ваша корзина пуста");
            System.exit(0);
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < productsBasket.size(); ) {
            System.out.print(productsBasket.get(i) + " ");
            i++;
            System.out.print(productsBasket.get(i) + " шт ");
            i++;
            System.out.print(productsBasket.get(i) + " руб/шт ");
            i++;
            System.out.print(productsBasket.get(i) + " руб в сумме");
            i++;
            System.out.print("\n");
        }
        System.out.print("Итого " + sumAllPurhases + " руб");
        System.out.print("\n");
    }
}

