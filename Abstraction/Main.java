package Abstraction;

public class Main {

    public static void main(String[] args){

        Circle circle = new Circle(10.5);
        Rectangle rectangle = new Rectangle(10.5,6.5);
        Triangle triangle = new Triangle(12,7.5);


        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
    
}
