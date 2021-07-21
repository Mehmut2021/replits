package replit06_Methods;

import java.util.Scanner;

public class MergeStrings {

    public static String mergeStrings(String one, String two) {

        String result = "";

        if(one.length()<=two.length()){
            for (int i = 0; i < one.length(); i++) {
                result += "" + one.charAt(i) + two.charAt(i);
            }
            result += two.substring(one.length());
        }else{
            for (int i = 0; i < two.length(); i++) {
                result += "" + one.charAt(i) + two.charAt(i);
            }
            result += one.substring(two.length());
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}
/*
Write a method **mergeStrings** that will return the strings merged, one letter at a time, starting with `one`.   Please note `one` and `two` can be of different lengths.

Examples:
```
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
```

```
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
```
 */