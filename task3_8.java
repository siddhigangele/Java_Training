package Task3;

/*8.	Write a Java program that takes a year from user and print whether that year is a leap year or not.*/

import java.util.Scanner;

public class task3_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year number");
        int leap_year = scanner.nextInt();
        boolean leap = false;

        if(leap_year % 4 == 0){
            if(leap_year %100 == 0){
                if(leap_year % 400 == 0){
                    leap = true;
                }
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;


        if(leap){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }


    }
}
