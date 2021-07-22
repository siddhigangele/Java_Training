package Task6;

/*2.	Write a program that would print the information (name, year of joining, salary, address)
        of three employees by creating a class named 'Employee'.
        The output should be as follows:
        Name        Year of joining        Address
        Robert            1994                64C- Walls Streat
        Sam                2000                68D- Walls Streat
        John                1999                26B- Walls Streat*/


public class Employee {

    String name, year, address;
    double salary;

    Employee(String n , String  y , String a ){
        this.name = n;
        this.year = y;
        this.address = a;


    }

    public void printDetails(){
        System.out.println("Name " + "  Year of Joining " + "  Address");
        System.out.println(name+" " + year+"         " + "    " + address );
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("siddhi","2021","164b street");
        e1.printDetails();
    }
}
