package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the centimeter value : ");
        int centiMeters = scanner.nextInt();

        double inches = centiMeters / 2.54;
        int feet = (int) (inches / 12);

        inches = inches - (feet * 12);

        String inchesStr = String.valueOf(inches);
        System.out.println(centiMeters + "cm is " + feet + " feet(s) and " + inchesStr.substring(0, 4) + " inches long" );

    }
}
