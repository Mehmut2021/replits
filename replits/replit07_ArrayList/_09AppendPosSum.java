package replit07_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _09AppendPosSum {

    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numList) {

        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : numList) {
            if (each > 0) {
                result.add(each);
                sum += each;
            }
        }
        result.add(sum);
        return result;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
/*
Create a static method that:

- is called `appendPosSum`
- returns an `ArrayList` of Integers
- takes one parameter: an ArrayList of Integers


This method should:

- Create a new ArrayList of Integers
- Add only the positive Integers to the new ArrayList
- Sum the positive Integers in the new ArrayList and _**add the Sum as the last element**_

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14),
with 14 being the sum of (4,3,4,3).
The original ArrayList should remain unchanged.
 */
