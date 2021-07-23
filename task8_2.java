package Task8;
//2.	Program to Count the number of words in the String using stream?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class task8_2 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>(Arrays.asList("siddhi" , "gangele"," consultadd"));
        long array1 = array.stream().count();
        System.out.println(array1);

    }
}
