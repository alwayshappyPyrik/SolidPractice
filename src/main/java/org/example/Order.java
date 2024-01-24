package org.example;

import java.util.Random;
import java.util.Scanner;

//В строке 9 выполняется принцип Open Closed
//В строке с 14 по 35 Single Responsibility

public class Order implements OrderAble {

    protected Scanner scanner = new Scanner(System.in);

    @Override
    public void markOrder() {
        String[] names = {"Петра", "Василия", "Ярослава", "Геннадия"};
        Random random = new Random();
        int idOrder = random.nextInt(1_000_000);
        int km = random.nextInt(30);
        String name = names[random.nextInt(3)];
        System.out.println("Ваш заказ " + idOrder + " " + "находится в " + km + " км у курьера " + name);
    }

    @Override
    public void refundOrder() {
        System.out.println("Укажите номер заказа, который хотите вернуть");
        int idOrder = scanner.nextInt();
        System.out.println("Ваш заказ номер " + idOrder + " возращен");
    }

    @Override
    public void repeatOrder() {
        System.out.println("Укажите номер заказа, который хотите повторить");
        int idOrder = scanner.nextInt();
        System.out.println("Ваш номер " + idOrder + " в корзине и ждет оплаты");
    }
}
