package org.example.ex3;

import java.util.Scanner;

/*
Even or Odd Checker
Prompt the user for an integer and use conditional statements to check if the number is even or odd.
Expected output: Number 5 is odd.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Introduceti un numar intreg:");
            int number = scanner.nextInt();

            if (number == 0) {
                isRunning = false;
//                break; // oprim doar bucla, nu intreaga aplicatie
//                return; // opreste executia METODEI
            } else if (number % 2 == 0) {
                System.out.println("Numarul " + number + " este par");
            } else {
                System.out.println("Numarul " + number + " este impar");
            }
        }


    }
}
