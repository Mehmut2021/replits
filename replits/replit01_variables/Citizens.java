package replit01_variables;

import java.util.Scanner;

public class Citizens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizens = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int newCitizenAge = scan.nextInt();

        if (newCitizenAge>=65){
            System.out.println("Senior Citizen");
            seniorCitizens+=1;

        }else{
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens+=1;
        }

        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

    }

}
/*
Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */