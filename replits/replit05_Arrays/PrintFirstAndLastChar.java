package replit05_Arrays;

import java.util.Scanner;

public class PrintFirstAndLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i < words.length; i++) {
            String eachWord = words[i];
            System.out.println("" + eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1));
        }

    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
home
shop
arse
last
pork
Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
```
 */