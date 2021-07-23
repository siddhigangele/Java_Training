package Task8;

//3.	Find the maximum value in Array using Streams?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class task8_3 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,5,2,4,6));

        Optional <Integer> min = array.stream().min((e1,e2)->e1-e2);
        if(min.isPresent()){
            System.out.println(min);
        }
    }
}
