package Task7;

//2.	Program to find the first non-repeated character in the String

public class task7_2 {
    public static void main(String[] args) {

        String sb= "siddhi";
        boolean value= false;
        for(int i = 0; i < sb.length(); i++){
            value = true;

            for(int j=0 ; j <sb.length();  j++){

                if((i!=j) && sb.charAt(i) == sb.charAt(j)){
                    value = false;

                }
            }

            if(value){
                System.out.println(sb.charAt(i));
                break;
            }
        }
    }

}
