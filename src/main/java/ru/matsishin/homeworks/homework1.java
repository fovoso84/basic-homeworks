package ru.matsishin.homeworks;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5");
        int result = scanner.nextInt();
        System.out.println(result);
        int rnd = (int) (Math.random() * 10);
        boolean b = Math.random() > 0.5;

        if (result == 1) {
            greetings();

        }
        if (result == 2) {
            checkSign(rnd, rnd, rnd);
        }
        if (result == 3) {
            selectColor(rnd);
        }
        if (result == 4) {
            compareNumbers(rnd, rnd);

        }
        if (result == 5) {
            addOrSubtractAndPrint(rnd, rnd, b);
        }


    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");

        }
        if (sum <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");

        }
        if (a <= b) {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int sum = initValue + delta;
        int diff = initValue - delta;
        if (increment) {
            System.out.println(sum);
        }
         else {
            System.out.println(diff);
        }
    }
}
