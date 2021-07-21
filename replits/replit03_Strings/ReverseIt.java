package replit03_Strings;

import java.util.Scanner;

public class ReverseIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()==5){

            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

        }else if(word.length()>5){

            System.out.println("Too long!");

        }else {

            System.out.println("Too short!");

        }

    }

}

/*
Write a program that will reverse a string. Your program should reverse a string _only 5 characters long_.
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:

```
input: cat

output: Too short!
```

```
input: singularity

output: Too long!
```
```
input: apple

output: elppa
```
 */
