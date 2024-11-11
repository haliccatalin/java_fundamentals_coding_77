package org.example.ex5;

import java.util.Scanner;

/*
Palindromic Number Checker
Prompt the user for a number and check if it reads the same backward.
Expected output (for input 121): 121 is a palindrome.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");

        int number = scanner.nextInt();
        int copNumber = number;
        int newNumber = 0;

        while (copNumber > 0) {
            newNumber = newNumber * 10 + (copNumber % 10);
            copNumber /= 10;
        }
        if (newNumber == number) {
            System.out.println("Numarul " + number + " este palindrom");
        } else {
            System.out.println("Numarul " + number + " nu este palindrom");
        }
    }
}
