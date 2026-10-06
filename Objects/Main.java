public class Main{
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println(car1.model);
        System.out.println(car1.make);
        System.out.println(car1.manufactureYear);
        System.out.println(car1.isRunning);

        car1.start();
        car1.stop();
    }
}