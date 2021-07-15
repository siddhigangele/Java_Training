package Task5;
//4.	Write a Java program to add two matrices of the same size.

import java.util.Scanner;

public class task5_4 {

    public static void main(String[] args) {
        int rows, columns, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        rows = in.nextInt();
        System.out.println("Input number of columns of matrix");
        columns  = in.nextInt();

        int array1[][] = new int[rows][columns];
        int array2[][] = new int[rows][columns];
        int sum[][] = new int[rows][columns];

        System.out.println("Enter the numbers for first matrix");

        for (  i = 0 ; i < rows ; i++ )
            for ( j = 0 ; j < columns ; j++ )
                array1[i][j] = in.nextInt();

        System.out.println("Enter the numbers for second matrix");

        for ( i = 0 ; i < rows ; i++ )
            for ( j = 0 ; j < columns ; j++ )
                array2[i][j] = in.nextInt();

        for ( i = 0 ; i < rows ; i++ )
            for ( j = 0 ; j < columns ; j++ )
                sum[i][j] = array1[i][j] + array2[i][j];

        System.out.println("Addition of the matrices are: ");

        for ( i = 0 ; i < rows ; i++ )
        {
            for ( j = 0 ; j < columns ; j++ )
                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }
    }

}
