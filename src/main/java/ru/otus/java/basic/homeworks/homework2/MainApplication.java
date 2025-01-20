package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {

    }

    public static void printsTheLineNTimes(String str, int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void printsTheSumOfTheArrayElementsThatAreGreaterThanFive(int[] array) {
        if (array.length <= 0) {
            return;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                result += array[i];
            }
        }
        System.out.println(result);
    }

    public static void fillsEachCellWithAnArrayOfNumbers(int number, int[] array) {
        if (array.length <= 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void incrementsEachElementOfTheArrayByTheSpecifiedNumber(int number, int[] array) {
        if (array.length <= 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void printsToTheConsoleTheSumOfTheElementsOfTheHalfThatIsGreater(int[] array) {
        if (array.length <= 0) {
            return;
        }

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length / 2; i++) {
            leftSum += array[i];
            rightSum += array[array.length - 1 - i];
        }

        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой половины больше суммы элементов правой: " + leftSum + " > " + rightSum);
            return;
        }

        System.out.println("Сумма элементов правой половины больше суммы элементов левой половины: " + rightSum + " >" + " " + leftSum);
    }
}