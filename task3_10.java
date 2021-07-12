package Task3;

/*Write a Java program to display Pascal's triangle.
        Test Data
        Input number of rows: 5
        Expected Output :
        Input number of rows: 5
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1*/


import java.util.Scanner;

public class task3_10 {
    public static void main(String[] args) {




        int  input; //loop variables i & j , input = number of rows
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();

        for (int line = 0; line < input; line++) {

            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff
                        (line, i) + " ");

            System.out.println();

        }


    }
    static int binomialCoeff(int n, int k)  // method to calculate binomial coefficient
    {
        int result = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
