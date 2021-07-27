package testCodesHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
        String sentence = "I love pie! do you love pie?";
        String target = "pie";
        boolean result = false;
        ArrayList<String> sentenceWords = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        for (int i = 0; i < sentenceWords.size(); i++) {
            String eachWordClean = "";
            String eachWord = sentenceWords.get(i);
            System.out.println(eachWord);
            System.out.println(eachWord.length());
            Character last = eachWord.charAt(eachWord.length()-1);
            System.out.println(last);
            if(eachWord.length()>1 && !Character.isLetterOrDigit(last)){
                eachWordClean = eachWord.substring(0,eachWord.length()-1);
                sentenceWords.set(i, eachWordClean);
            }
        }

        if(Collections.frequency(sentenceWords, target)==2){
            result = true;
        }
        System.out.println(sentenceWords);
        System.out.println(result);

    }

}
