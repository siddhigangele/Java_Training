package Task2;
/*
Given an integer , perform the following conditional actions:
        •	If  is odd, print NEW
        •	If  is even and in the inclusive range of 2 to 5 , print OLD
        •	If  is even and in the Inclusive range of 6 to 30, print NEW
        •	If  is even and greater than 30, print OLD
        Complete the stub code provided in your editor to print whether or not is weird.*/


import java.util.Scanner;

public class task2_6 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input % 2 != 0){
            System.out.println("odd number");
            System.out.println("New");
        }
        else if( input % 2 ==0 && (input>= 2 && input<=5)){
            System.out.println("OLD");
        }
        else if(input % 2 ==0 && (input>= 6 && input<=30)){
            System.out.println("NEW");
        }
        else if(input % 2 ==0 && input > 30){
            System.out.println("OLD");
        }

    }


}
