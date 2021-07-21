package replit06_Methods;

import java.util.Scanner;

public class StringMethod_RemoveDupes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String result = "";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(!result.contains("" + ch[i])){
                result+="" + ch[i];
            }

        }

        return result;
    }
}
/*
**uniqueChars** is a method that will accept any String and return the
* String with out any duplicate characters

Examples:
```
uniqueChars("java") ==> "jav"
```
```
uniqueChars("mama") ==> "ma"
```
```
uniqueChars("spoon") ==> "spon"
```
 */