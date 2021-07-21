package replit04_Loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        String threeLetters = "";
        for (int i = 0; i <= str.length() - 3; i++) {

            threeLetters = str.substring(i, (i + 3));

            if (threeLetters.charAt(0) == threeLetters.charAt(1) &&
                    threeLetters.charAt(0) == threeLetters.charAt(2) &&
                    str.contains(threeLetters)) {

                count++;

            }
        }
        System.out.println(count);
    }

}
