package LW_04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        String number = String.valueOf(sc.nextInt());
        System.out.println("The number " + number + " has " + number.length() + " digits.");
    }
}
