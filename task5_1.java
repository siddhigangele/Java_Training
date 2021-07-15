package Task5;

//1.	Write a Java program to remove duplicate elements from an array.

public class task5_1 {

    public static void main(String[] args) {

        int integer_array [] = {1,2,1,4,2};

        // loop variables i & j
        for(int i = 0 ; i <integer_array.length-1 ;i++){ //0,1,2,3,4 index values
            for(int j= i+1; j<integer_array.length;j++){ //1,2,3,4 values

                if((integer_array[i] == integer_array[j]) && (i !=j)){
                    System.out.println("duplicates in the array are: " +integer_array[j]);
                }

            }
        }

    }
}
