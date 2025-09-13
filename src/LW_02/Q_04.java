package LW_02;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers separated by space");

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int max2 = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max2 = max;
                max = array[i];
            } else if (array[i] > max2){
                max2 = array[i];
            }
        }

        System.out.println(max2);
    }
}
