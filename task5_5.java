package Task5;

/*5.	Write a Java program to move all 0's to the end of an array.
        Maintain the relative order of the other (non-zero) array elements. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task5_5 {

    public static  void zeroEnd(int array[] , int array_length){
        int count =0;
        int temp;

        for(int i = 0; i < array_length ; i++){
            if ((array[i] != 0)) {
                temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count = count + 1;
            }

        }

    }

    static void displayArray(int array[], int length_array) {
        for (int i = 0; i < length_array; i++){

            System.out.print(  array[i] + " ");}
    }

    public static void main(String[] args) {

        int array [] = { 1,5,2,0,4,2,0};
        int array_length = array.length;

        zeroEnd(array, array_length);
        displayArray(array,array_length);


    }
}
