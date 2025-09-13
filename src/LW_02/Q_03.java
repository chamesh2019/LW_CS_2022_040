package LW_02;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            for (int k = 0; k < i - j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
