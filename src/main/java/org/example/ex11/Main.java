package org.example.ex11;

import java.util.Arrays;

/*
Reverse Array
Write a program that reverses an array of integers.
Expected output (for input [1, 2, 3, 4, 5]): Reversed array: [5, 4, 3, 2, 1]
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int[] reversedNumbers = new int[5];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[(numbers.length - 1) - i] = numbers[i];
        }

        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.println(reversedNumbers[i]);
        }

    }
}
