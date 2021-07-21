package replit04_Loops;

import java.util.Scanner;

public class PrintNTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = "";

        for (int i = 1; i <= n ; i++) {
            result = result + "*";
            //System.out.println(result);
        }

        System.out.println(result);
    }

}
/*
Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.

Example:

```
input: 1

output: *
```

Example:

```
input: 3

output: ***
```
 */