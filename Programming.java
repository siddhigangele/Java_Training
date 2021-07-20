package Task6;

/*6.	Create a class named 'Programming'. While creating an object of the class,
        if nothing is passed to it, then the message "I love programming languages" should be printed.
        If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
        For example, while creating object if we pass "Java", then "I love Java" should be printed.
        There can be more than one programming languages.*/


public class Programming {

    String program_language;

    Programming(){
       program_language = "programming language";
    }

    Programming(String language){
        this.program_language = language;
    }

    public void printLanguage(){
        System.out.println("I love " + program_language);
    }

    public static void main(String[] args) {
        Programming p1 = new Programming();
        p1.printLanguage();

        Programming p2 = new Programming("Java, AWS , python");
        p2.printLanguage();
    }
}
