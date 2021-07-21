package replit06_Methods;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String converted = timeConversion(scan.nextLine());
        System.out.println(converted);

        scan.close();
    }

    public static String timeConversion(String s) {
        String str = "";
        if (s.contains("AM")) {
            if(s.equals("12:00:00AM")){//11:23:45AM
                str = "00:00:00";
            }else {
                str = s.substring(0, s.length() - 2);
            }
        } else if (s.contains("PM")) {//2:55:22PM

            if (s.charAt(1) == ':') {// 12:00:00PM
                s = "0" + s;//
            }
            int a = s.charAt(0) - '0';// a=1
            int b = s.charAt(1) - '0';// b =2
            str = ((a * 10) + b + 12) + s.substring(2, s.length() - 2);
            //      10      + 2    +12 24:00:00

            if(str.startsWith("24")){
                str = "12:00:00";
            }

        }
        return str;
    }

}
/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The **timeConversion** method should convert and print the given number (String argument)

```
Input: 07:05:45PM

Output: 19:05:45
```

```
Input: 07:15:55AM

Output: 07:15:55
```
 */