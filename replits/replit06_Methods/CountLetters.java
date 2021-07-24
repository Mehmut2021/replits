package replit06_Methods;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        String result = "";

        char[] strChars = str.toCharArray();

        for (int i = 0; i < strChars.length; i++) {
            int count = 0;
            for (int j = 0; j < strChars.length; j++) {
                if(strChars[i]==strChars[j]){
                    count++;
                }
            }
            if(!result.contains(""+strChars[i])){
                result += "" + count + strChars[i];
            }
        }


        return result;

    }

}
/*
Write a method **countLetters** that can count letters in a given string and
return a new string in the given format:

```
number of letters + letter
```
Example:
```
input: countLetters("aaabbcccc");
output: "3a2b4c"
```
 */