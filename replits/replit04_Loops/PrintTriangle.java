package replit04_Loops;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = "";
        for (int k = 1; k <= n; k++) {
            result+="*";
            System.out.println(result);
        }

    }
}
/*
Write a program that will create a triangle of asterisks based on size **n**.

Example:

```
input: 5

output:
*
**
***
****
*****
```

Example:

```
input: 3

output:
*
**
***
 */