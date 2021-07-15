package Task5;

//2.	Write a Java program to find the second largest element in an array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task5_2 {
    public static void main(String[] args) {

        ArrayList<Integer> integer_array = new ArrayList<>(Arrays.asList(1,4,9,12,3));
        Collections.sort(integer_array);
        System.out.println("The sorted array is: " + integer_array);

        System.out.println("The second largest element is: ");
        System.out.println(integer_array.get(integer_array.size() - 2));


    }
}
