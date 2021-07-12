package Task3;

/*
6.	Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers are in increasing
    order, "DECREASING" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. FOR eg.
        •	Input first number: 1524
        •	Input second number: 2345
        •	Input third number: 3321
*/


import java.util.Scanner;

public class task3_6 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Enter first number: ");
                int first_number = in.nextInt();
                System.out.print("Enter second number: ");
                int second_number = in.nextInt();
                System.out.print("Enter third number: ");
                int third_number = in.nextInt();

                if (first_number < second_number && second_number < third_number)
                {
                    System.out.println("The numbers are in Increasing order");
                }
                else if (first_number > second_number && second_number > third_number)

                {
                    System.out.println("The numbers are in Decreasing order");
                }
                else
                {
                    System.out.println("Neither increasing or decreasing order");
                }




    }
}
