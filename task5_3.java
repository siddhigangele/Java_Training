package Task5;

//3.	Write a Java program to find the second smallest element in an array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task5_3 {
    public static void main(String[] args) {


        ArrayList<Integer> integer_array = new ArrayList<>(Arrays.asList(1,4,9,12,3));
        Collections.sort(integer_array);
        System.out.println("The sorted array is: " + integer_array);

        System.out.println("The second smallest element is: ");
        System.out.println(integer_array.get(1));

    }
}
