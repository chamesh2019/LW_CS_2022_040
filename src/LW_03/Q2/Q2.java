package LW_03;

import LW_03.lib.Temperature;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit : ");
        temperature.setFahrenheit(input.nextDouble());

        System.out.println("The temperature saved in the object is " + temperature.toCelsius() + "C");
    }
}
