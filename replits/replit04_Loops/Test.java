package replit04_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};
        num1=num2;
        System.out.println(Arrays.toString(num1));
    }

}


