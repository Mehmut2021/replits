package replit02_Statements;

import java.util.Scanner;

public class QuizQuestion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here
        String result = "";

        switch (a){

            case "a":
                result = "a is wrong";
                break;
            case "b":
                result = "b is correct";
                break;
            case "c":
                result = "c is wrong";
                break;
            default:
                result = a + "is not a valid answer";

        }

        System.out.println(result);

    }

}
