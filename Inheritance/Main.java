package Inheritance;

public class Main {

    public static void main(String[] args){

        //Inheritance = one class inherits the attributes and methods from another class.Basically a child class inherits from the parent class


        Person person1 = new Person("Spongebob","SquarePants");

        Student student1 = new Student("Harry","Porter",3.5);

        student1.showName();
        System.out.println(student1.gpa);
    }
    
}
