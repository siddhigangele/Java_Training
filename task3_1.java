package Task3;
/*
1.	Write a simple program to print multiplication table of a certain number taken from user,
        For eg. 2 X 1 = 2
        2 X 2 = 4
        and so on.
*/

import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i = 0; i <=10 ; i++){
            System.out.println(input + "*" + i +"=" + i*input);
        }
    }
}
