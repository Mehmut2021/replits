package replit03_Strings;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int indexFirstBread = str.indexOf("bread");
        int indexSecondBread = str.lastIndexOf("bread");

        //System.out.println(str.substring(indexFirstBread,indexFirstBread+5));
        //System.out.println(str.substring(indexSecondBread,indexSecondBread+5));

        if(indexFirstBread!=indexSecondBread) {
            if (str.substring(indexFirstBread, indexFirstBread + 5).equals(str.substring(indexSecondBread, indexSecondBread + 5))) {
                System.out.println(str.substring(indexFirstBread + 5, indexSecondBread));
            }
        }else {
            System.out.println("nothing");
        }



    }

}

/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.


Example:

```
input: breadjambread

output: jam
```

```
input: xxbreadjambreadyy

output: jam
```

```
input: xxbreadapple

output: nothing
```

```
input: breadbutterbread

output: butter
```
 */
