package replit04_Loops;

import java.util.Scanner;

public class CountJava {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            String str = word.substring(i,i+4);
            if(str.equals("java")){
                count ++ ;
            }
        }

        System.out.println(count);
    }

}

/*
Print the number of times that the string "java" appears anywhere in the given string **word**

Example:

```
input: javaxjava

output: 2
```


Example:


```
input: javaxjavaapplepearjavaegg

output: 3
```
 */