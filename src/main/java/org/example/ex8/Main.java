package org.example.ex8;

import java.util.Scanner;

/*
Count Vowels in a String
Prompt the user to input a string, then use a loop to count the number of vowels (a, e, i, o, u) in it.
Expected output (for input "Hello World"): Vowels count: 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Textul: ");
        String text = input.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int contor = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (text.charAt(i) == vowels[j]) {
                    contor++;
                }
            }
        }
        System.out.println("Numarul de vocale este de: " + contor);
    }
}
