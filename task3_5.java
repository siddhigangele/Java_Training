package Task3;

/*
5.	Write a JAVA program that takes long type input from user, and
        d.	Calculate and display the number of digits.
        e.	Calculate the sum of all the digits of the input.
*/


import java.sql.SQLOutput;
import java.util.Scanner;

public class task3_5 {

    public static void main(String[] args) {

        long input;
        int count=0;
        int sum = 0;
        System.out.println("Enter long input");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLong();

        while(input !=0){
            sum += input % 10;
            input /= 10;
            ++count;


        }


        System.out.println("sum is " +sum);
        System.out.println("number of digits are : " +count);
    }
}
