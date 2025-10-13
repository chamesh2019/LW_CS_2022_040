package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power of 10 (e.g., 6, 9, 12): ");
        int power = scanner.nextInt();

        String name = switch (power) {
            case 6 -> "Million";
            case 9 -> "Billion";
            case 12 -> "Trillion";
            case 15 -> "Quadrillion";
            case 18 -> "Quintillion";
            case 21 -> "Sextillion";
            case 30 -> "Nonillion";
            case 100 -> "Googol";
            default -> "0";
        };

        // Output the result
        if (!name.equals("0")) {
            System.out.println("10^" + power + " is a " + name + ".");
        } else {
            System.out.println("No standard name for 10^" + power + ".");
        }

    }
}
