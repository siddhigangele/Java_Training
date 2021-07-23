package Task8;

//6.	Print the square of each number present in array using stream and write the output into file

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task8_6 {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,5,6,2,3));
        List<Integer> array =  array1.stream().map(x->x*x).collect(Collectors.toList());
        array.forEach(System.out::println);
    }
}
