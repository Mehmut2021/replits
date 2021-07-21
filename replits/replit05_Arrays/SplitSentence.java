package replit05_Arrays;

import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] str = sentence.split(" ");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
/*
Given a String variable **sentence,** write code to type each word in separate lines.

Example:

```
sentence -> "Java is fun"

Print

Java
is
fun
```
 */