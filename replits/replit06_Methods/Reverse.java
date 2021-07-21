package replit06_Methods;

import java.util.Scanner;

public class Reverse {

    public static String reverse(String input) {

        String result = "";
        String[] inputArr = input.split("");
        for (int i = inputArr.length - 1; i >= 0; i--) {
            result += inputArr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
/*
The **reverse** method will reverse the given String

Example:
```
reverse("foo") ==> "oof"
```
```
reverse("student") ==> "tneduts"
```
 */