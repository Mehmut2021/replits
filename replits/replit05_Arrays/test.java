package replit05_Arrays;

import utilities.ArraysUtility;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        String word = "anna";
        String temp = "";
        char[] chars = word.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            temp += chars[i];
        }
        if(word.equals(temp)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        for (int each : arr) {
            max = Math.max(each , max);
        }
        System.out.println("max = " + max);


        System.out.println(Arrays.toString(ArraysUtility.addElement(arr , 7)));
    }
}
