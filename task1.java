package Task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        //TASK_1: Swap two numbers using third variable as result name and do the same task without using any third variable.
        int a = 8;
        int b = 6;
        int result;

        //swapping the variables using third variable

        result = a;
        a = b;
        b = result;

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);

        //swapping variable without using third variable
        System.out.println("*******");

        int x = 5;
        int y= 10;

        x = x + y;
        y = x -y;
        x = x - y;


        System.out.println("The value of x: " + x);
        System.out.println("The value of y: " + y);







    }
}
