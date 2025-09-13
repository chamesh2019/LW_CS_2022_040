package LW_02;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String formattedSentence = removePunctuations(sentence);

        if (checkPalindrome(formattedSentence)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

    }

    static String removePunctuations(String s){
        return s.replaceAll("[^A-Za-z]", "").toLowerCase();
    }

    static Boolean checkPalindrome(String s){
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
