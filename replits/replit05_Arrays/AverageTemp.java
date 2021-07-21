package replit05_Arrays;

import java.util.Scanner;

public class AverageTemp {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double sum = 0;
        for (int i = 0 ; i <= temps.length-1 ; i++) {
            sum+=temps[i];
        }

        System.out.println(sum/ temps.length);
    }
}
/*
Given an array **temps** with temperature values find and print the average value


Example:

```
input: 80 88 88 84 82 78 60 68

output: 78.5
```
 */