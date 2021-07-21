package replit03_Strings;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int w1 = word1.length();
        int w2 = word2.length();

        if (w1>w2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }



    }

}

/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

```
input:
bill
check

```
```
output: check
```
 */
