package Task3;
/*3.	Write a JAVA program that takes user input from 1 to 12 for months, and display number of days of a particular month.
        (Shows “Invalid Details“ if incorrect month number will be provided).*/

import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int input_month = scanner.nextInt();

        if(input_month == 4 || input_month == 6 || input_month == 9 || input_month == 11){
            System.out.println("the number of days in" + input_month + " month are: 30 days");

        }
        else if (input_month == 2){
            System.out.println("Enter the year to check if its leap year");
            int year = scanner.nextInt();
            boolean leap = false;

            // if the year is divided by 4
            if (year % 4 == 0) {

                // if the year is century
                if (year % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // if the year is not century
                else
                    leap = true;
            }

            else
                leap = false;

            if (leap) {
                System.out.println(year + " is a leap year.");
                System.out.println("The number of days in" + input_month +" month are 29 days");
            }
            else{
                System.out.println(year + " is not a leap year.");
                System.out.println("The number of days in" + input_month +" month are 28 days");
            }
        }
        else if(input_month == 1 || input_month == 3 || input_month == 5 || input_month == 7 || input_month == 8 || input_month == 10 || input_month ==12)
            System.out.println("The number of days in" + input_month +" month are 31 days");

        else if(input_month >= 12 || input_month <= 1){
            System.out.println("Invalid month");
        }

    }


}




