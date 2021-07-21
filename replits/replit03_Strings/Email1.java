package replit03_Strings;

import java.util.Scanner;

public class Email1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = "";
        String lastName = "";
        String domain = "";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        if (indexOf_ >= 0){
            firstName = email.substring(0,indexOf_);
            lastName = email.substring(indexOf_+1,indexOfAt);
            System.out.println(lastName + "_" + firstName + email.substring(indexOfAt));
        }else{
            System.out.println(email);
        }

    }

}

/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:


```
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
```

```
input: barakobama@gmail.com

output: barakobama@gmail.com
```

 */