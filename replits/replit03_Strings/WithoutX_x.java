package replit03_Strings;

import java.util.Scanner;

public class WithoutX_x {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String firstLetter = "";
        String lastLetter = "";

        boolean startsWith = word.startsWith("x")||word.startsWith("X");
        boolean endsWith = word.endsWith("x")||word.endsWith("X");

        if(startsWith&&endsWith){
            System.out.println(word.substring(1,word.length()-1));
        }else if(startsWith){
            System.out.println(word.substring(1,word.length()));
        }else if(endsWith){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }


    }

}

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.


Example:

```
input: xHiX

output: Hi
```

```
input: apple

output: apple
```

```
input: xUxL

output: UxL
```

```
input: JavaX

output: Java
```
 */