package LW_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the outer circle : ");
        int r1 = sc.nextInt();
        Circle circle1 = new Circle(r1);

        System.out.println("Enter the radius of the inner circle : ");
        int r2 = sc.nextInt();
        Circle circle2 = new Circle(r2);




        System.out.println("Area of the circular part is "+ (circle1.computeArea() -  circle2.computeArea()));

    }
}

