package Task2;

 /*Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
         Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds  .*/

import java.util.Scanner;

public class task2_7 {
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        int int_number = (int)number;
        System.out.println("the absolute value is: " + int_number);

        if(number == 0 ){
            System.out.println("Zero");
        }
        else{
            if(int_number < 1 ){
                System.out.println("small");
            }
            else{
                System.out.println("large");
            }
        }



    }
}
