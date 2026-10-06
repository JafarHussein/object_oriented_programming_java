package GettersSetters;

public class Car {

    private String model;
    private String make;
    private int manufactureYear;
    private double price;

    Car(String model, String make, int manufactureYear, double price){
        this.model=model;
        this.make=make;
        this.manufactureYear=manufactureYear;
        this.price=price;
    }

    // Getter method make a field readable

    String getModel(){
        return this.model;
    }
    String getMake(){
        return this.make;
    }
    int getYear(){
        return this.manufactureYear;
    }
    double getPrice(){
        return this.price;
    }


    void setMake(String make){
        this.make=make;
    }

    void setPrice(double price){
        this.price=price;
    }

    void setYear(int year){
        this.manufactureYear=year;
    }

    void setModel(String model){
        this.model=model;
    }


    
}
