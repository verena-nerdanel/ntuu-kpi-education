package org.vera.bps.practicum1.task1;

import java.util.Scanner;

/**
 * Обчислити значення функції y для варіанта № 2
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // comment

        System.out.print("Введіть значення х: ");
        final double x = scanner.nextDouble();

        final double y = getY(x);
        System.out.println("y: " + y);
    }

    private static double getY(double x) {
        final double a = 18.5;

        double y;
        if (x <= 1) {
            y = Math.pow(Math.sin(Math.sqrt(Math.abs(a * x))), 2);
        } else {
            y = Math.log10(x + 1);
        }

        return y;
    }
}