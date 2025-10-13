package LW_04;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        String text = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) System.out.println("The word " + text + " is a palindrome.");
        else System.out.println("The word " + text + " is not a palindrome.");
    }
}
