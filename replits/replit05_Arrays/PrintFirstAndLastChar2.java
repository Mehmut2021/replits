package replit05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] chars = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String eachWord = words[i];
            chars[i] = "" + eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1);
        }
        System.out.println(Arrays.toString(chars));
    }
}
/*
Given a String array **words**, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
```
 */