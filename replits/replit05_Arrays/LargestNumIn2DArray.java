package replit05_Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestNumIn2DArray {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols { {1,2,3} , {4,5,6} }
        }//end for rows

        int largestNum = arr[0][0];
        int[][] newArr = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largestNum) {
                    largestNum = arr[i][j];
                }
            }
        }

        System.out.println(largestNum);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                    newArr[i][j] = largestNum;

            }
        }

        System.out.println(Arrays.deepToString(newArr));
    }

}
