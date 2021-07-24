package replit06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {

        char[] word1Char = word1.trim().toLowerCase().toCharArray();
        Arrays.sort(word1Char);
        char[] word2Char = word2.trim().toLowerCase().toCharArray();
        Arrays.sort(word2Char);
        if (Arrays.equals(word1Char, word2Char)) {
            return true;
        }else{
            return false;
        }

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}
/*
**_Anagram_** is a word, phrase, or name formed by rearranging the letters of another,
such as _cinema_, formed from _iceman_.

The **isAnagram** method checks if word1 and word2 are anagram to each other then
return a boolean.

- each letter in `word1` should appear in `word2` exact number of times
- ignore empty spaces
- make your code case insensitive

Examples:
```
isAnagram("listen", "Silent") ==> true
```
```
isAnagram("earth", "heart") ==> true
```
```
isAnagram("star", "rats") ==> true
```
```
isAnagram("hi", "bye") ==> false
```
```
isAnagram("java", "cava") ==> false
```
 */