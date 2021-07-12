package Task3;

/*4.	Write a JAVA program that takes one integer input n from the user, and display all the numbers, print sum of n natural numbers.?*/


import java.util.Scanner;

public class task3_4 {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 0 ; i <= number ; i++){
            sum+=i;

        }
        System.out.println("The sum of " +number + " natural numbers is: " +sum);
    }
}
