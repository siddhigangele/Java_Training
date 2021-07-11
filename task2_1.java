package Task2;

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        //Write a program in JAVA to print a number is divisible by 3 it should print “Consultadd” as a string
        //•	If a number is divisible by 5 it should print “JAVA Training” as a string
        //•	If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int  first_number = scanner.nextInt();

        if (first_number % 3 ==0 &&  first_number % 5 ==0){
            System.out.println("Consultadd Java Training");
        }
        else if(first_number % 3 == 0)
        {
            System.out.println("Consultadd");
        }
        else if(first_number % 5 == 0)
        {
            System.out.println("Java Training");
        }
        else
        {
            System.out.println("Default case");
        }





    }
}
