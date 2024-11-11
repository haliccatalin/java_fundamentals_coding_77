package org.example.ex2;

/*
Sum of Natural Numbers
Write a program that uses a for loop to find the sum of the first 10 natural numbers.
Expected output: The sum of the first 10 natural numbers is: 45
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
//            sum += i;

            sum = sum + i;
        }

        System.out.println("Suma primelor 10 numere naturale este " + sum);

        int i = 0;
        sum = 0;

        while (i < 10) {
            sum = sum + i;
            i++;
        }

        System.out.println("Suma primelor 10 numere naturale este " + sum);

        i = 0;
        sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i < 10);
    }
}
