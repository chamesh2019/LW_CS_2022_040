package LW_03;

import LW_03.lib.Temperature;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temperature in Celsius: ");
        temperature.setCelsius(input.nextDouble());

        System.out.println("The temperature saved in the object is " + temperature.toCelsius() + "C");
        System.out.println("The temperature saved in the object is " + temperature.toFahrenheit() + "F");
    }
}
