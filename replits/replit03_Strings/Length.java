package replit03_Strings;

import java.util.Scanner;

public class Length {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter text:");
        String text = scan.next();
        //int textLength = text.length();
        System.out.println("Lenght is: " + text.length());

    }

}
