package Inheritance;

public class Student extends Person{

    double gpa;

    Student(String firstName, String lastName, double gpa){
       super(firstName, lastName);
       this.gpa=gpa;
    }

    void showGpa(){
        System.out.printf("%s %s has a gpa of %.2f",firstName, lastName, gpa);
    }
}
