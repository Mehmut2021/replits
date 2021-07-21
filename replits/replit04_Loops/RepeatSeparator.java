package replit04_Loops;

import java.util.Scanner;

public class RepeatSeparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i = 1; i < count+1; i++) {
            result+=word;//initial result is empty. This will add the first word input to the result

            if(i==count){ //this ends the loop after adding the word to result before adding seperator.
                break;
            }else{
                result+=separator; //This adds the seperator to the result.
            }
            }
        System.out.println(result);
        System.out.println("\n" +
                "    i \"love\" java\\coffee");
    }

}
/*
Given two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word, separated by the separator string.

    i "love" java\coffee
Example:


```
input:
Word
X
3

output: WordXWordXWord
```

Example:


```
input:
This
And
2

output: ThisAndThis
```


Example:


```
input:
This
And
1

output: This
```
 */
