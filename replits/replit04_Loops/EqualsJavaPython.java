package replit04_Loops;

import java.util.Scanner;

public class EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount = 0;
        int pythonCount = 0;



        for (int i = 0; i <= sentence.length()-4; i++) {
            String java = sentence.substring(i,i+4);
            System.out.println(java);
            if(java.equals("java")){
                javaCount ++ ;
            }
        }
        for (int i = 0; i <= sentence.length()-6; i++) {
            String python = sentence.substring(i,i+6);
            System.out.println(python);
            if(python.equals("python")){
                pythonCount ++ ;
            }
        }

        if(javaCount==pythonCount){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

}

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is
equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:


```
input: We study java not python

output: true
```


Example:


```
input: What's the difference between java, javascript and python?

output: false
```
 */