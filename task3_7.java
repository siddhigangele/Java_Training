package Task3;

/*7.	Write a Java program to find the number of days in a month.
        Test Data
        Input a month number: 2
        Input a year: 2016
        Expected Output :
        February 2016 has 29 days */


import java.util.Scanner;

public class task3_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int input_month = scanner.nextInt();

        if(input_month == 4 || input_month == 6 || input_month == 9 || input_month == 11){
            System.out.println("the number of days in" + input_month + " month are: 30 days");

        }
        else if (input_month == 2){
            System.out.println("Enter the year to check if its leap year");

            int leap_year = scanner.nextInt();
            boolean leap = false;

            // if the year is divided by 4
            if (leap_year % 4 == 0) {

                // if the year is century
                if (leap_year % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (leap_year % 400 == 0)
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
                System.out.println(leap_year + " is a leap year.");
                System.out.println("The number of days in" + input_month +" month are 29 days");
            }
            else{
                System.out.println(leap_year + " is not a leap year.");
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
