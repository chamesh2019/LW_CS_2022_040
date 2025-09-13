package LW_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to find the middle character : ");
        String word = input.nextLine();

        if (word.length() % 2 == 1){
            System.out.println(word.charAt(word.length() / 2));
        } else {
            System.out.println("String has even number of characters.");
        }
    }
}
