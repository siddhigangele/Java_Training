package Task3;

/*
2.	Write a program in which:
        a.	Take 10 values input from user using loop.
        b.	Print sum of all the numbers provided
        c.	Print the Average of those 10 values
*/


import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input , sum = 0 , average;

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter 10 values");
            input = scanner.nextInt();
            sum = sum + input;          //adding the numbers




        }
        average = sum/10; // average of the number
        System.out.println("The total sum is" +sum);
        System.out.println("The average is" +average);
    }
}
