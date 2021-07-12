package Task3;
/*9.	Write a program in Java to display the pattern like right angle triangle with a number.
        Test Data
        Input number of rows : 10
        Expected Output :
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/


import java.util.Scanner;

public class task3_9 {
    public static void main(String[] args) {
        int i , j, input; //loop variables i & j , input = number of rows
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        input= in.nextInt();

        System.out.println("Expected output: ");

        for(i=1;i<=input;i++) //outer loop
        {
            for(j=1;j<=i;j++)  //inner loop
                System.out.print(j);

            System.out.println("");
        }

    }
}
