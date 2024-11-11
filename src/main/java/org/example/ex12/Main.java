package org.example.ex12;

import java.util.Scanner;

/*
Calculate Sum and Average
Given an array of integers, calculate the sum and average of its elements.
Expected output (for input [2, 4, 6, 8, 10]): Sum: 30, Average: 6.0
 */
public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
//        int[] numbersV2 = {2,4,6,8,10};

        // adaugare elemente in array
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        // citirea/afisarea elementelor din array
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        Scanner scanner = new Scanner(System.in);

//        for(int i = 0; i < numbers.length; i++) {
//            System.out.println("Introduceti un numar: ");
//            // citim de la tastatura pe fiecare element
//            numbers[i] = scanner.nextInt();
//        }

        System.out.println("Numbers:");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
//            int nr = numbers[i];
//
//            System.out.println(nr);

            System.out.println("------");

            System.out.println(numbers[i]);

            sum = sum + numbers[i];
        }

        sum = 17;

        System.out.println("Suma este: " + sum);
        System.out.println("Media este: " + ((double) sum / numbers.length));


    }
}
