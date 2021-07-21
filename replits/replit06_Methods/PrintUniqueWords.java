package replit06_Methods;

import java.util.Scanner;

public class PrintUniqueWords {

    //void method to print unique words in an array
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

}

/*
Complete the void method **printUniqueWords()** that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:

```
input:[java, code, python, code, rust, code, rust]

output:
java
python
```
 */
