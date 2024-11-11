package org.example.ex7;

import java.util.Scanner;

/*
 String Length and Character Count
Ask the user for a string input. Print the length of the string and count how many times the character a appears.
Expected output (for input "Java programming"): Length: 16, Count of 'a': 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un text: ");
        String text = scanner.nextLine();

        int counterA = 0;

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);

            if (a == 'a') {
                counterA++;
            }
        }

        System.out.println("Length: " + text.length() + ", a: " + counterA);
    }
}
