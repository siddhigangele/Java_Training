package Task6;

/*3.	Write a program to print the names of students by creating a Student class. If no name is passed
        while creating an object of Student class, then the name should be "Unknown",
        otherwise the name should be equal to the String value passed while creating object of Student class.
        (Hint: Overloading concept*/

public class Student {

    String name;

    Student(){
        name = "unknown";
    }

    Student(String NAME){
        this.name = NAME;
    }

    public void printName(){

        System.out.println("The name of student is: " + name);
    }

    public static void main(String[] args) {

        Student student_object = new Student();
        student_object.printName();
        Student st_object = new Student("Siddhi");
        st_object.printName();
    }
}
