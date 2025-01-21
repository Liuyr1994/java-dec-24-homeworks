package ru.otus.java.basic.homeworks.homework3;

import java.util.Arrays;

public class MainApplications {
    public static void main(String[] args) {

    }

    public static int sumOfPositiveElements(int[][] array) {
        if (array.length == 0 && array[0].length == 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    public static void printsSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void itGoesDiagonallyWrong(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[array.length - i - 1][i] = 0;
        }

        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }

    public static int findMax(int[][] array) {
        if (array.length == 0 && array[0].length == 0) {
            return -1;
        }

        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        return maxElement;
    }

    public int theSumOfTheElementsOfTheSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }

        int result = 0;
        for (int i = 0; i < array[1].length; i++) {
            result += array[1][i];
        }

        return result;
    }
}
