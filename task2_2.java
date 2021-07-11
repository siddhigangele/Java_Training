package Task2;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {

        int result = 0;

        System.out.println("Enter one option from below:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Average");


        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        System.out.println("Enter first_number");
        int first = scanner.nextInt();
        System.out.println("Enter second_number");
        int second = scanner.nextInt();


        switch (input1) {
            case 1:
                result = first + second;
                System.out.println("The addition is: " + result);
                break;

            case 2:
                result = first - second;
                System.out.println("The subtraction is: " + result);
                break;

            case 3:
                result = first * second;
                System.out.println("The multiplication is: " + result);
                break;

            case 4:
                result = first / second;
                System.out.println("The division is: " + result);
                break;

            case 5:
                System.out.println("Enter two numbers for average");
                int first1 = scanner.nextInt();
                int second1 = scanner.nextInt();
                result = (first1 + second1) / 2;
                System.out.println("The average of the two numbers is: " + result);
                break;

            default:
                System.out.println("Invalid choice");


        }
    if (result<0){
        System.out.println("OOPS OPTION" + input1 +" is returning negative value");

    }

    }
}
