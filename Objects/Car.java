public class Car{

    String model="Ford";
    String make ="Mustang";
    int manufactureYear=2025;
    boolean isRunning=false;


    void start(){
        isRunning=true;
        System.out.println("The engine has started");
    }

    void stop(){
        isRunning=false;
        System.out.println("The engine has stopped");
    }
}