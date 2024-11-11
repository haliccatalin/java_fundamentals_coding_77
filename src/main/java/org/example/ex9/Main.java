package org.example.ex9;

import java.util.Scanner;

/*
Count Uppercase and Lowercase Letters

Write a program to count how many uppercase and lowercase letters are in a given string.
Expected output (for input "Hello World"): Uppercase letters: 2, Lowercase letters: 8
 */
public class Main {
    public static void main(String[] args) {
        int counUppercase = 0;
        int countLowercase = 0;

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                counUppercase++;
            } else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                countLowercase++;
            }
        }
        System.out.println("Uppercase letters: " + counUppercase + ", Lowercase letters: " + countLowercase);

    }
}
