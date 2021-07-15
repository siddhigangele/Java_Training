package Task4;

/*a.	Write a JAVA program that reverse the words of a sentence.
        i.	For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”.*/



public class task4_4a {

    //method with reverse functionality
    public static String reverse(String input_string){

        String input[] = input_string.split(" ");

        String reverse_string = "";  //final output variable

        for(String i : input){  // i = loop variable

            StringBuilder sb = new StringBuilder(i); // string builder object to use in-built reverse function
            sb.reverse();
            reverse_string += sb.toString() + " ";  // converting array values back to string

        }

        return  reverse_string;
    }
    public static void main(String[] args) {

        System.out.println(reverse("Be Happy and Stay Motivated"));


    }
}
