package replit05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] str = sentence.split(" ");// [what, is, this]

        String reverse = "";
        for (int i = str.length - 1 ; i >= 0; i--) {
            reverse += str[i] + " ";
        }

        System.out.println(reverse.substring(0,(reverse.length()-1)));

    }
}
/*
Given a String variable **sentence,** write code to get each word and assign to String **reversed** in reverse order.

Example:

```
sentence -> Java is fun

reversed > fun is Java
```
 */