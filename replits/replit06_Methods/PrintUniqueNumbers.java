package replit06_Methods;

import java.util.Scanner;

public class PrintUniqueNumbers {

    //void method to print unique numbers in an array
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

}
/*
Write a void method **printUniqueNumbers** that will print unique numbers from an array of ints.`

Example:

```
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]

output:
2
9
34
```
 */