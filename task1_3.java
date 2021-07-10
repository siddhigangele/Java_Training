package Task1;

import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {

        //•	Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
        System.out.println("Please enter a number in between 1-10");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println("Please enter another number in between 1-10");
        Scanner scanner1 = new Scanner(System.in);
        int input2 = scanner1.nextInt();

        int z = input1 + input2;
        System.out.println("The sum is: " + z);

        //•	Use z for adding 30 into it and print the final result by using variable results.
        z += 30; // z = z + 30
        System.out.println("The final result is: " + z);
    }
}
