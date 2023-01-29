package org.vera.bps.practicum1.task2;

import java.util.Scanner;

public class Main {

    private static double f5(double x) {
        return Math.abs(Math.cos(2 * x)) / 1.12 - Math.cos(3 * x - 2) + 6.15;
    }

    private static double f6(double x) {
        return Math.sin(x) * Math.pow(Math.cos(x), 2) * Math.sin(x + 1.4) / 0.85 + 7.14;
    }

    private static double f7(double x) {
        return Math.abs(Math.sin(2 * x - 1.5)) * 4 - 3 * Math.sin(4 * x) + 2.38;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення х: ");
        final double x = scanner.nextDouble();

        System.out.print("Введіть тип роботи (А, Б, В): ");
        final String workType = scanner.next();

        if ("А".equals(workType)) {
            double y = 100 * Math.abs(f5(x) + 50);
            double tax = 0.1 * y;
            double netto = y - tax;
            System.out.println("Нараховано всього (до оподаткування), грн.: " + y);
            System.out.println("Сума податку, грн: " + tax);
            System.out.println("Сума до видачі, грн: " + netto);
        } else if ("Б".equals(workType)) {
            double y = 150 * Math.abs(f6(x) + 100);
            double tax = 0.15 * y;
            double netto = y - tax;
            System.out.println("Нараховано всього (до оподаткування), грн.: " + y);
            System.out.println("Сума податку, грн: " + tax);
            System.out.println("Сума до видачі, грн: " + netto);
        } else if ("В".equals(workType)) {
            double y = 100 * Math.abs(f7(x) + 135);
            double tax = 0.2 * y;
            double netto = y - tax;
            System.out.println("Нараховано всього (до оподаткування), грн.: " + y);
            System.out.println("Сума податку, грн: " + tax);
            System.out.println("Сума до видачі, грн: " + netto);
        } else {
            System.out.println("Тип робіт не існує: " + workType);
        }
    }
}
