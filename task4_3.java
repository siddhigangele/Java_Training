package Task4;

//3.	Write a JAVA method to remove all the spaces from the String and return the resultant.

import java.util.ArrayList;
import java.util.Arrays;

public class task4_3 {

    public static void main(String[] args) {

        //ArrayList<String> string_array = new ArrayList<>(Arrays.asList("THIS IS TASK 4"));

        String input_string = "THIS IS TASK 4";
        System.out.println("Input string is: " + input_string);
        String output_string = input_string.replaceAll("\\s", "");
        System.out.println("Output string is: ");
        System.out.println(output_string);

    }
}
