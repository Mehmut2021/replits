package replit_Sort;

import java.util.*;

public class _01AppearsTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String target = scan.next();

        System.out.println(appearsTwice(target, sentence));

    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        boolean result = false;
        ArrayList<String> sentenceWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for (int i = 0; i < sentenceWords.size(); i++) {
            String eachWord = sentenceWords.get(i);
            Character last = eachWord.charAt(eachWord.length() - 1);
            if (eachWord.length() > 1 && !Character.isLetterOrDigit(last)) {
                String eachWordClean = eachWord.substring(0, eachWord.length() - 1);
                sentenceWords.set(i, eachWordClean);
            }
        }

        if(Collections.frequency(sentenceWords, target)==2){
            result = true;
        }

        return result;
    }

}
/*
# `Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.`

```
`Examples:`
```
```
`Main.appearsTwice("java", "java is fun!")`
```
```
      `- returns false, because java appears only once.`
```
```
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
```
```
      `- returns true, because laptop appears twice.`
```
 */