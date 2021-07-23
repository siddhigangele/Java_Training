package Task7;

//4.	Program to find if String has all Unique Characters?

public class task7_4 {

    public static void main(String[] args) {
        String st = "mansi";
        boolean value= false;

        for(int i = 0; i < st.length(); i++){


            for(int j=0 ; j <st.length();  j++){

                if( st.charAt(i) == st.charAt(j)){
                    value = true;


                }
                else
                    value= false;

            }

            if(value){
                System.out.println("string is not unique");
                break;
            }
            else
            {
                System.out.println("string is unique");
                break;
            }




    }
}}
