package org.example.ex10;

import java.util.Scanner;

/*
Remove Duplicate Characters

Prompt the user to enter a string, then remove any duplicate characters.
Expected output (for input "programming"): progamin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        return result;
    }
}