package org.example;

public class NumberProcessing {

    public static double fahrenheitToCelcius(double temperature){
        return (temperature - 32) / 9 * 5;
    }

    public static double cmToKm (double cm) {
        return cm / 100000;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
