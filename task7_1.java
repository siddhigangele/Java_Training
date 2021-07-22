package Task7;

//1.	Program to reverse a string in java

public class task7_1 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("siddhi");
        System.out.println("Input string is: " + input);
        StringBuilder reversed_input= input.reverse();
        System.out.println("The reverse string is: " + reversed_input);
    }
}
