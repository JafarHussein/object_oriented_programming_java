import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("We are going to write a simple programme to calculate the area of a triangle");

        System.out.println("Provide the base of your triangle: ");

        double base = inputScanner.nextDouble();

        System.out.println("Provide the height of your triangle: ");

        double height=inputScanner.nextDouble();

        System.out.println("Provide the unit of measurement: ");

        String unitMeasurement=inputScanner.next();

        try{

        double area = 0.5 * base * height;

        System.out.printf("The area of your triangle is %.2f %s", area, unitMeasurement);
        }
        catch(ArithmeticException e){
            
            System.out.println("Check the measurements for base and height provided");
        }
        catch(Exception e){

            System.out.println("something went wrong");
        }
        finally{

            inputScanner.close();

        }
    }
    
}

