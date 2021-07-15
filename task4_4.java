package Task4;

/*4.	Write a JAVA method to return a boolean true if the string doesn’t have repeating letters
        and consecutive or nonconsecutive i.e. all the letters of the string be unique (isogram) else false.*/

public class task4_4 {

    public static void main(String[] args) {

        String string = "abcb";  //input string
        boolean value= false;   //initialising as false

        for(int i = 0 ; i <string.length(); i++){  //comparing the letters
            for(int j= i +1; j <string.length(); j++){
                if(string.charAt(i) == string.charAt(j)){   //if two letters match set value to true

                    value = true;
                }
            }
        }
        System.out.println("boolean: " + value);
    }
}
