package Task2;

/*Write a program in JAVA to break and continue if the following cases occurs:
        •	If user enters a negative number just break the loop and print “It’s Over”
        •	If user enters a positive number just continue in the loop and print “Good Going”*/



import java.util.Scanner;

public class task2_4 {
    public static void main(String[] args) {

        System.out.println("enter a number upto 5");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for( int i = 0 ; i <= 5 ; i++){
            if(input < 0){
                System.out.println("its over");
                break;
            }
            else{
                System.out.println("good going");
                continue;

            }
        }


    }
}
