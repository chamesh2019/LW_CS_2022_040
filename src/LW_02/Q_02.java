package LW_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int i = scanner.nextInt();
            if (i < 0) {
                break;
            }

            String number = String.valueOf(i);
            System.out.println("There are " + number.length() + " numbers in " + i + ".");

            int count = 0;
            while (i > 0) {
                count++;
                i /= 10;
            }
            System.out.println("There are " + count + ".");
        }
    }
}
