package replit03_Strings;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLength = word.length();
        boolean isOdd = wordLength%2==1;

        if(isOdd){

            if(wordLength>=3){
                System.out.println(word.charAt(wordLength/2));
            }else{
                System.out.println(word+word+word);
            }

        }else{
            if(wordLength>=4){
                System.out.print(word.charAt(wordLength/2-1));
                System.out.println(word.charAt(wordLength/2));
            }else{
                System.out.println(word+word);
            }

        }


    }

}

/*
You have a word, do the following:

1. When word has **odd number of characters and:**

 - **3 or more characters, print middle letter**

```
      oak ==> a
```

```
      javav ==> v
```

- **Single character, print that character 3 times**

```
      # ==> ###
```

```
      q ==> qqq
```

2. When word has **even number of characters and**:

 - **4 or more characters**, print the middle 2 characters

```
     java ==> av
```

```
     apples ==> pl
```

```
     #$%^&* ==> %^
```

 - **2 characters,** print those 2 characters twice

```
      @@ ==>@@@@
```

```
      $$ ==>$$$$
```

```
      hi ==> hihi
```
 */
