package GettersSetters;

public class Main {


    public static void main(String[] args){

        Car car1 = new Car("Ford","Charger",2025,50000);

        //using the getter methods in java
        car1.getModel();
        car1.getMake();
        car1.getYear();
        car1.getPrice();


        car1.setPrice(230000);
        car1.setModel("Ford");
    }
    
}
