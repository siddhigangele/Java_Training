package Task6;

/*
4.	Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is
        'length*breadth'. The class has three constructors which are :
        1 - having no parameter - values of both length and breadth are assigned zero.
        2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
        3 - having one number as parameter - both length and breadth are assigned that number.
        Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/


public class Rectangle {

    double length, breadth, area;

    Rectangle(){
        length = 0 ;
        breadth = 0;
    }

    Rectangle(double len , double bd){
        this.length = len;
        this.breadth = bd;
    }

    Rectangle(double one_number){
        this.length = one_number;
        this.breadth = one_number;
    }

    public  double calculateArea(){

        area = length * breadth;
        System.out.println("the area is: " + area);
        return area;

    }

    public static void main(String[] args) {

        Rectangle object = new Rectangle();  // using default constructor
        object.calculateArea();

        Rectangle object1 = new Rectangle(5,6);  // parameterised constructor
        object1.calculateArea();

        Rectangle object2 = new Rectangle(5); // using one number as parameter in constructor
        object2.calculateArea();

    }
}
