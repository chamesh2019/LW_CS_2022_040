package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Full Name : ");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        System.out.println(lastName + ", " + firstName + " "+ middleName.charAt(0) + ".");
    }
}
