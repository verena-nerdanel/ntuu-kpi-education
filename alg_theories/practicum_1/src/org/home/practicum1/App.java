package org.home.practicum1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    // Input: 8 1 3 80 4 7 9
    // Output: 2
    public static void main(String[] args) throws IOException {
        int limit = 0;
        List<Integer> numbers = null;

        // input
        Scanner scanner = new Scanner(System.in);

        int mode;
        do {
            System.out.println("Select mode:");
            System.out.println("1 - manual input");
            System.out.println("2 - file input");
            System.out.println("3 - random input");

            mode = scanner.nextInt();
        } while (mode < 1 || mode > 3);

        switch (mode) {
            // manual input
            case 1 -> {
                System.out.print("Enter numbers (separated by space): ");
                scanner.nextLine();
                String[] values = scanner.nextLine().split(" ");

                numbers = new ArrayList<>();
                for (String value : values) {
                    numbers.add(Integer.parseInt(value));
                }

                System.out.print("Enter limit: ");
                limit = scanner.nextInt();
            }

            // file input
            case 2 -> {
                System.out.print("Enter name of file containing numbers: ");
                String fileName = scanner.next();

                numbers = Files.lines(Paths.get(fileName))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                System.out.print("Enter limit: ");
                limit = scanner.nextInt();
            }

            // random
            case 3 -> {
                Random random = new Random();

                numbers = new ArrayList<>();
                for (int i = 0; i < 12; i++) {
                    numbers.add(random.nextInt(100));
                }

                limit = random.nextInt(100);

                System.out.println("Numbers: " + numbers);
                System.out.println("Limit: " + limit);
            }
        }

        // process
        int count = getCount(numbers, limit);

        // output
        System.out.println("Count of numbers higher than limit: " + count);
    }

    private static int getCount(List<Integer> numbers, int limit) {
//        int count = 0;
//
//        for (int number : numbers) {
//            if (number > limit) {
//                count++;
//            }
//        }
//
//        return count;

        return (int) numbers.stream()
                .filter(x -> x > limit)
                .count();
    }
}
