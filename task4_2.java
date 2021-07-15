package Task4;

//2.	Write a JAVA program that gives sum of all the values of array except the highest and lowest values.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task4_2 {
    public static void main(String[] args) {

        //Taking th array
        ArrayList<Integer> integer_array = new ArrayList<>(Arrays.asList(1,2,8,5,6));
       double addition = 0;

        Collections.sort(integer_array);  //sorting the array in ascending order
        System.out.println("The sorted array is: " + integer_array);

        for(int i = 1 ; i < integer_array.size()-1;i++){  //i = loop variable; iterating from index position value 1 to highest-1
           addition += integer_array.get(i);

        }

        System.out.println("the sum except the highest and lowest values is: " + addition);

    }
}
