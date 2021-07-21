package replit03_Strings;

import java.util.Scanner;

public class FirstLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        char first = word.charAt(0);
        System.out.println("first = " + first);
    }

}
