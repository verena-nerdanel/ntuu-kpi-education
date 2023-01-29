package org.vera.bps.practicum1.task3;

import java.util.Scanner;

/**
 * Є дані про автомобілі чотирьох моделей. Як вхідне дане ввести номер моделі й отримати характеристики:
 * назву автомобіля, рік випуску і ціну.
 */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер моделі автомобіля (C40, S90, XC40, V60): ");
        final String modelNumber = scanner.next();

        switch (modelNumber) {
            case "C40" -> {
                System.out.println("Назва автомобіля: Volvo C40");
                System.out.println("Рік випуску: 2022");
                System.out.println("Вартість автомобіля: 2 054 476 грн.");
            }
            case "S90" -> {
                System.out.println("Назва автомобіля: Volvo S90");
                System.out.println("Рік випуску: 2022");
                System.out.println("Вартість автомобіля: 2 283 491 грн.");
            }
            case "XC40" -> {
                System.out.println("Назва автомобіля: Volvo XC40");
                System.out.println("Рік випуску: 2022");
                System.out.println("Вартість автомобіля: 1 605 865 грн.");
            }
            case "V60" -> {
                System.out.println("Назва автомобіля: Volvo V60");
                System.out.println("Рік випуску: 2022");
                System.out.println("Вартість автомобіля: 2 226 376 грн.");
            }
            default -> System.out.println("Не знайдено потрібних моделей");
        }
    }
}
