package replit05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//volt, olive, fish, hot pursuit, warning, python, java, coffee, part

        //str = str.replace(" ", "");//remove all spaces between words
        String[] sentence = str.split(", "); //string converted to array without commas
                                                    //[volt,olive,fish,hot pursuit,warning,python,java,coffee,part]

        String shortestWord = sentence[0];//volt length 4

        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() < shortestWord.length()) {
                shortestWord = sentence[i];
            }
        }

        String shortSentence = "";//volt fish java part
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() == shortestWord.length()) {
                shortSentence += sentence[i] + " ";
            }
        }

        String[] shortArray = shortSentence.split(" ");
        Arrays.sort(shortArray);
        System.out.println(Arrays.toString(shortArray));

    }
}
/*
volt, olive, fish, hot pursuit, warning, python, java, coffee, part
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

> Hint: Split values by comma: split(", ");

```
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
```
 */