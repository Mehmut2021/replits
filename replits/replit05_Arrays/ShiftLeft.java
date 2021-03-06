package replit05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt(); //2,4,1,1,2
        }

        int[] newNums = new int[size];

        newNums [size-1] = nums[0]; //4,0,0
        System.out.println(newNums[size-1]);
        for (int i = 0; i < nums.length-1; i++) {
            newNums[i] = nums[i+1]; //2,2,4,1,1
        }
        System.out.println(Arrays.toString(newNums));
    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.`

Example:
```
input: 6, 2, 5, 3

output: [2, 5, 3, 6]
```
 */
