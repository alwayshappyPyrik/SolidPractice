package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//В строке 10 выполняется принцип Open Closed
//в строке 16 с 43 выполняется принцип Single Responsibility

public class Rating implements RatingAble {

    Scanner scanner = new Scanner(System.in);
    List<String> ratingProducts = new ArrayList<>();

    @Override
    public void ratingProducts() {

        Products products = new Products();
        products.addProducts();
        products.printAvailableProducts();

        while (true) {
            System.out.println("Выберите имя товара или 'end'");
            String productName = scanner.nextLine();
            if (productName.equals("end")) {
                break;
            }

            ratingProducts.add(productName);
            System.out.println("Введите рейтинг этому товару");
            String productRating = scanner.nextLine();
            ratingProducts.add(productRating);
        }

        for (int i = 0; i < ratingProducts.size(); ) {
            System.out.print("Товар: " + ratingProducts.get(i) + " ");
            i++;
            System.out.print("c рейтингом: " + ratingProducts.get(i));
            i++;
            System.out.print("\n");
        }
    }
}

