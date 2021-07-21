package replit01_variables;

import java.util.Scanner;

public class FindMidNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = scan.nextInt();
        System.out.println("Enter second number:");
        int n2 = scan.nextInt();
        System.out.println("Enter third number:");
        int n3 = scan.nextInt();

        int medValue = 0;

        if((n2<n1&&n1<n3)||(n3<n1&&n1<n2)){
            medValue = n1;
        }else if((n1<n2&&n2<n3)||(n3<n2&&n2<n1)){
            medValue = n2;
        }else{
            medValue = n3;
        }

        System.out.println("Medium value is: " + medValue);
    }

}

/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.


1. Create an object of Scanner class.

2. Declare int 3 variables: num1, num2, num3.

Example:

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34
```
 */
