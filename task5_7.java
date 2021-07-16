package Task5;

/*7.	Write a Java program to get the difference between the largest and smallest values in an array of integers.
        The length of the array must be 1 and above.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task5_7 {
    public static void main(String[] args) {

        ArrayList<Integer> integer_array = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 5));
        int difference , largest_element , smallest_element;

        if (integer_array.size() < 2) {
            System.out.println("Array should have at least two elements");
        } else {

            Collections.sort(integer_array);
            System.out.println("The sorted array is: " + integer_array);
            smallest_element = integer_array.get(0);
            largest_element = integer_array.get(integer_array.size()-1);
            difference = largest_element - smallest_element;
            System.out.println("The difference is: " + difference);



        }
    }
}