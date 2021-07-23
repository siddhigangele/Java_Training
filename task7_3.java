package Task7;

//3.	Program to find the intersection of two arrays in java?

public class task7_3 {
    public static void main(String[] args) {
        int  array1[] = {1,5,4,2,3};
        int  array2[] = {8,7,3,1,5};

        System.out.println("The intersection of arrays is:");

        for (int i = 0 ; i < array1.length; i ++){
            for (int j =0 ; j< array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }

        }
    }


}
