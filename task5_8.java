package Task5;

/*8.	Write a Java program to remove the duplicate elements of a given array and return the new length of the array.*/

import java.util.ArrayList;
import java.util.Arrays;

public class task5_8 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,1,5,4,2));

        for(int i = 0; i<array.size(); i++){
            for(int j = i+1; j<array.size(); j++){
                if(array.get(i)==array.get(j)){

                    array.remove(j);
                }
            }

        }
        System.out.println(array);
        System.out.println("The length of new array is: " + array.size());


    }
}
