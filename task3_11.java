package Task3;

/*11.	Write a Java program that accepts two floating¬ point numbers and checks whether they are the same up to two decimal places*/

import java.util.Scanner;

public class task3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first floating point number");
        float first_number = scanner.nextFloat();
        System.out.println("Enter second floating point number");
        float second_number = scanner.nextFloat();

        first_number = Math.round(first_number*100);
        first_number = first_number/100;

        second_number = Math.round(second_number*100);
        second_number= second_number/100;

        if(first_number == second_number){
            System.out.println("the two numbers are same up to two places of decimal");
        }
        else
            System.out.println("the two numbers are not same up to two places of decimal");


    }
}
