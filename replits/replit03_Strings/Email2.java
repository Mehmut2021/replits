package replit03_Strings;

import java.util.Scanner;

public class Email2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = "";
        String lastName = "";
        String domain = "";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDotCom = email.lastIndexOf(".");

            firstName = email.substring(0, indexOf_);
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

            lastName = email.substring(indexOf_ + 1, indexOfAt);
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

            domain = email.substring(indexOfAt+1,indexOfDotCom).toLowerCase();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }

}

/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

```
Input: craig_federighi@apple.com

```
```
Output:
First name: Craig
Last name: Federighi
Domain: apple
```
 */