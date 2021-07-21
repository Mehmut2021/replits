package replit06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod_WordCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));

    }

    public static int wordCount(String words) {
        // your code

        String[] str = words.split(" ");
        return str.length;
    }

}
/*
**wordCount** accepts String and returns how many words are in the given String

Example:
```
wordCount("foo bar")
returns 2
```
```
wordCount("one two three")
returns 3
```
```
wordCount("bla")
returns 1
```
Hint: look at spaces
 */