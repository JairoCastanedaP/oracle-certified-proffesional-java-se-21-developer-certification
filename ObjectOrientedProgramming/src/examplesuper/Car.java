package examplesuper;

public class Car {
    boolean isAutomatic= false;

    public Car(){
        System.out.println("Default constructor of the superclass");
    }

    public void accelerate(){
        System.out.println("Car accelerate");
    }
}
