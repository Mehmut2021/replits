package replit05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] str = email.split("@");


        if(str.length==2){
            System.out.println("Email id: " + str[0]);
            System.out.println("Email domain: " + str[1]);
        }

        else if(str.length>2 || str.length==1){
            System.err.println("invalid email");

        }

    }
}
/*
Given a String variable **email**,
write code using split method to print email id and domain in separate lines.

Example:

```
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
```

If email contains no @ character or multiple @ characters then print _**invalid email**_:

```
email -> hello-gmail.com

Output:
invalid email
```

```
email -> my@fancy@email.com

Output:
invalid email
```
 */