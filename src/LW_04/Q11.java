package LW_04;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int guess = new Random().nextInt(100);

        Scanner sc = new Scanner(System.in);
        int entry;
        while (true){
            System.out.print("Enter a guess : ");
            entry = sc.nextInt();
            if (entry == guess){
                System.out.println("You have guessed correctly.");
                break;
            } else if (entry < guess) {
                System.out.println("You have entered a lower number");
            } else {
                System.out.println("You have entered a higher number");
            }
        }
    }
}
