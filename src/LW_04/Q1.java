package LW_04;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3integer values separated by spaces : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int t = a;
        if (t > b) t = b;
        if (t > c) t = c;

        System.out.println("Minimum number is : " + t);
    }
}
