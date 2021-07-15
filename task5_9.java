package Task5;

/*
9.	Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
        a.	Sample array: [1,2,4,5,6]
        b.	Target value: 6.
*/


public class task5_9 {

   // method to get the pair
    static void sumPair(int integer_array[], int target_value){

        for(int i = 0 ; i <integer_array.length;i++){
            for(int j = i+1; j <integer_array.length;j++){

                if(integer_array[i]+ integer_array[j] == target_value){

                    System.out.println("The pair of integers whose sum is " + target_value + " are: " + integer_array[i] +" and " + integer_array[j]);

                }
            }
        }

    }


    public static void main(String[] args) {

        sumPair(new int[]{1,2,4,5,6},6);



    }
}
