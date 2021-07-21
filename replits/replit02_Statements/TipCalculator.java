package replit02_Statements;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String isSplit = scan.next();
        int numberOfPeople = scan.nextInt();
        double checkAmount = scan.nextDouble();
        String serviceQuality = scan.next();

        int tipPercentage = 0;

        String result = "";

        for (int i = 1; i <= numberOfPeople ; i++) {
            result = result + "&";
            //System.out.println(result);
        }

        //System.out.println(result);
        /*
        String people = "";
        switch (numberOfPeople){
            case 1:
                people = "&";
                break;
            case 2:
                people = "&&";
                break;
            case 3:
                people = "&&&";
                break;
            case 4:
                people = "&&&&";
                break;
            case 5:
                people = "&&&&&";
                break;
        }
        */

        switch (serviceQuality){
            case "Poor":
                tipPercentage = 5;
                break;
            case "Fair":
                tipPercentage = 10;
                break;
            case "Good":
                tipPercentage = 15;
                break;
            case "Great":
                tipPercentage = 20;
                break;
            case "Excellent":
                tipPercentage = 25;
                break;
        }

        double totalPay = checkAmount + (checkAmount*tipPercentage/100);
        double totalTip = checkAmount*tipPercentage/100;

        if(isSplit.equals("Yes")){


            System.out.println("Split:");
            System.out.println("Number of people:");
            System.out.println("Check amount:");
            System.out.println("Service Quality:");
            System.out.println("Number of people entered: "+result);



            System.out.println(  "Total to pay: " + totalPay  );
            System.out.println(  "Total tip: " + totalTip  );
            System.out.println("Total per person: " + totalPay/numberOfPeople);
            System.out.println("Tip per person: " + totalTip/numberOfPeople);


        }



    }

}

/*
Write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
    and if there is a split of the bill or not.

> Poor = 5%
> Fair = 10%
> Good = 15%
> Great = 20%
> Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

```
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
```
 */