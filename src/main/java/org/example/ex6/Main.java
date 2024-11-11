package org.example.ex6;

import java.util.Scanner;

/*
Palindromic String Checker
Prompt the user for a String and check if it reads the same backward.
Expected output (for input ANA): ANA is a palindrome.

ana => lungimea = 3
012
 */
public class Main {
    public static void main(String[] args) {
        variantaCuFor();
//        variantaCuStringBuilder();
    }

    private static void variantaCuFor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant:");
        String text = scanner.nextLine();

        String newText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }

        if (text.equalsIgnoreCase(newText)) {
            System.out.println(text + " este palindrom!");
        } else {
            System.out.println(text + " nu este palindrom!");
        }
    }

    private static void variantaCuStringBuilder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant:");
        String text = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);

        String newText = stringBuilder.reverse().toString();
        System.out.println(newText);

        if (text.equalsIgnoreCase(newText)) {
            System.out.println(text + " este palindrom!");
        } else {
            System.out.println(text + " nu este palindrom!");
        }
    }
}
