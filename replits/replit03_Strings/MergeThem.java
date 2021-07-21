package replit03_Strings;

import java.util.Scanner;

public class MergeThem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        char one1 = word1.charAt(0);
        char two1 = word2.charAt(0);
        char one2 = word1.charAt(1);
        char two2 = word2.charAt(1);
        char one3 = word1.charAt(2);
        char two3 = word2.charAt(2);

        System.out.println(""+one1+two1+one2+two2+one3+two3);

    }

}
