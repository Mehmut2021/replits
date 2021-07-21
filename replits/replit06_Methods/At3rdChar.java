package replit06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class At3rdChar {

    public static String at3(String target, String word) {

        String alt = target.substring(0,3) + word + target.substring(3);
        /*
        String result = "";
        String[] targetArr = target.split("");
        String[] wordArr = word.split("");
        String[] resultArr = new String[wordArr.length + targetArr.length];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            resultArr[i] = targetArr[count++];
        }

        for (int j = 3; j < wordArr.length+3; j++){
            resultArr[j] = wordArr[j-3];
        }

        for (int k = 3 + wordArr.length; k< resultArr.length; k++){
            resultArr[k] = targetArr[count++];
        }

        for (String each : resultArr) {
            result+=each;
        }
        return result;

         */
        return alt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }

}
/*
**at3** accepts two strings and returns a string.

The first string is the one that will be manipulated. At the 3rd char position of target you will insert the word argument.

Example:

```
at3("longword","foo")
return: "lonfoogword"
```
```
at3("blabla","a")
return: "blaabla"
```
 */