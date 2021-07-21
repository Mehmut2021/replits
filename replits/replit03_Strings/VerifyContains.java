package replit03_Strings;

import java.util.Scanner;

public class VerifyContains {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();//hot
        String sentence = scan.nextLine();//it is hot today

        boolean itContains = sentence.contains(word);

        System.out.println(itContains);

    }

}
