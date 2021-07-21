package replit04_Loops;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i <= word.length()-3; i++) {
            String str = word.substring(i,(i+3));
            //System.out.println(str);
            if(str.equals("cat")){
                countOfCats++;
            }else if(str.equals("dog")){
                countOfDogs++;
            }
        }

        //System.out.println("countOfDogs = " + countOfDogs);
        //System.out.println("countOfCats = " + countOfCats);

        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
/*
Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
```
 */
