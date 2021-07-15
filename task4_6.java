package Task4;

/*6.	Write a JAVA program that swaps the case of the alphabets of the string,
        a.	For eg,  => “heLLo WOrLd” => “HEllO woRlD”.*/

public class task4_6 {

    public  static  void stringConverter(StringBuilder input){

        for(int i = 0 ; i < input.length(); i++){
            Character letter = input.charAt(i);
            if(Character.isLowerCase(letter)){
                input.replace(i,i+1,Character.toUpperCase(letter) + "");
            }
            else{
                if(Character.isUpperCase(letter)){
                    input.replace(i,i+1,Character.toLowerCase(letter) + "");
                }
            }
        }
    }

    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder("heLLo WOrLd");
       stringConverter(sb);
        System.out.println(sb);
    }
}
