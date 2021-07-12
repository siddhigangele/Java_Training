package Task2;
/*

Write a JAVA program which takes character input from the user,
        •	If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
        •	Print NOT FOUND for all the other alphabets.
*/


import java.util.Scanner;

public class task2_8 {
    public static void main(String[] args) {

        System.out.println("Enter any character");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);

        if(character == 'r' || character == 'a' || character == 'n' || character == 'd' || character == 'o' || character =='m'){
            System.out.println("found");
        }
        else if(character == 'R' || character == 'A' || character == 'N' || character == 'D' || character == 'O' || character =='M'){
            System.out.println("found");
        }
        else System.out.println("not found");

    }
}
