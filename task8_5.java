package Task8;
//5.	Convert the string in upper case using stream?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task8_5 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("siddhi is my name"));

        String string = str.stream().collect(Collectors.joining("")).toUpperCase();
        System.out.println(string);


    }
}
