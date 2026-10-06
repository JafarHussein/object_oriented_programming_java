package Constructors;

public class Main {

    public static void main(String[] args){
        Student student1 = new Student("Spongebob","Hospitality",3.5);
        Student student2= new Student("Patrick","N/A", 2.3);
        Student student3 = new Student("squidward","Accounting",2.7);


        System.out.println(student1.name);
        System.out.println(student1.major);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.major);
        System.out.println(student2.gpa);
    }
    
}
