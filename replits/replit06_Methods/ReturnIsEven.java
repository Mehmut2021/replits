package replit06_Methods;

import java.util.Scanner;

public class ReturnIsEven {

    public static boolean isEven(int n) {

        boolean isEven = n % 2 == 0;

        return isEven;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

}
/*
**isEven** accepts a number and checks if it is even.
* If the given number is even return true, otherwise return false.

Examples:

```
isEven(1) --> false
```

```
isEven(8) --> true
```
 */