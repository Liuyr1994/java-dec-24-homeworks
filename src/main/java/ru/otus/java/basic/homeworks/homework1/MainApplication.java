package ru.otus.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите пожалуйста число от 1 до 5: \nИли введите любой другой символ или цифру и " + "приложение завершит свою работу.");
            int choosingMethod = sc.nextInt();
            if (choosingMethod == 1) {
                greetings();
            } else if (choosingMethod == 2) {
                Random rand = new Random();
                checkSign(rand.nextInt(), rand.nextInt(), rand.nextInt());
            } else if (choosingMethod == 3) {
                selectColor();
            } else if (choosingMethod == 4) {
                compareNumbers();
            } else if (choosingMethod == 5) {
                Random rand = new Random();
                addOrSubtractAndPrint(rand.nextInt(), rand.nextInt(), rand.nextBoolean());
            } else {
                return;
            }
        } while (sc.hasNextInt());
    }

    public static void greetings() {
        System.out.println("Hello, \nWorld, \nfrom, \nJava;");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c > -1) {
            System.out.println("Сумма положительная: " + (a + b + c));
            return;
        }
        System.out.println("Сумма отрицательная: " + (a + b + c));
    }

    public static void selectColor() {
        Random rand = new Random();
        int data = rand.nextInt();
        if (data < 11) {
            System.out.println("Красный");
        } else if (data > 10 && data < 21) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
            return;
        }
        System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
            return;
        }
        System.out.println(initValue - delta);
    }
}
