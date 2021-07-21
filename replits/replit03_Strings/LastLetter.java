package replit03_Strings;

import java.util.Scanner;

public class LastLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();

        System.out.println(word.charAt(length-1));

    }

}
