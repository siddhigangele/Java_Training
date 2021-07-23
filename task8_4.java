package Task8;

//4.	Find the Average value in a list of Integers using stream?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class task8_4 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,5,4,8,5));
        OptionalDouble array1 = array.stream().mapToInt((x)->x).average();
        System.out.println(array1);

    }
}
