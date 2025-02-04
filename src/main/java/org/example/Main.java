package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit temperature : ");
        System.out.println("To Celsius : " + NumberProcessing.fahrenheitToCelsius(scanner.nextDouble()) + " C");

        System.out.println("----------------------");

        System.out.print("Centimeter : ");
        System.out.println("To Kilometer : " + NumberProcessing.cmToKm(scanner.nextDouble()) + " Km");

        System.out.println("----------------------");

        System.out.print("Number to check : ");
        System.out.println("Is Even : " + NumberProcessing.isEven(scanner.nextInt()));

        scanner.nextLine();

        System.out.println("----------------------");

        System.out.print("Input original text : ");
        String text = scanner.nextLine();
        System.out.print("Character to be removed : ");
        String characterRemoved = scanner.nextLine();
        System.out.println("Result : " + TextProcessing.removeChar(text, characterRemoved));

        System.out.println("----------------------");

        System.out.print("Check palindrome : ");
        System.out.print("Is palindrome : " + TextProcessing.checkPalindrome(scanner.next()));

        scanner.close();
    }
}