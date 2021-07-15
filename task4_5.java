package Task4;

/*
5.	Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,[Text Wrapping Break]
        For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2
        => {22,44,64,76,98,12,43,54,90} // Output for this case =>43.
*/


public class task4_5 {

    public static void getEven(int array[]){

        for(int i = 0; i<array.length; i ++){
            if(array[i] % 2 == 0){
                System.out.println("The even numbers in the array are: " +array[i]);
            }
        }

    }

    public static void getOdd(int array[]){
        for(int i = 0; i<array.length; i ++){
            if(array[i] % 2 != 0){
                System.out.println("The odd numbers in the array are : " + array[i]);
            }
        }
    }




    public static void main(String[] args) {

        //int array[] = {1,5,2,4,6};

        getEven(new int[]{1,2,4,8,7});  //to get even numbers
        getOdd(new int[]{1,3,5,4,2});   // to get odd numbers





    }
}
