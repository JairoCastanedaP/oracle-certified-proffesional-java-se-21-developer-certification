package polymorphism;


public class Test {

    public static void main(String[] args) {
        Vehicle vehicle= new Car();// this code works because the Car Class is subclass of vehicle
        vehicle.accelerate(); //

        if(vehicle instanceof Car){
            Car car = (Car) vehicle;
        }

        Vehicle vehicle2 = new Motorcycle();
        vehicle2.accelerate();//print Motorcycle is accelerating

        //Car car= (Car) new Vehicle();//Throws class cast exception

        printAccelerate(new Car());
        printAccelerate(new Motorcycle());
    }

    public void printAccelerate(Vehicle vehicle){
        vehicle.accelerate();
    }
    public  static void printAccelerate(Car car){
        car.accelerate();
    }

    public  static void printAccelerate(Motorcycle motorcycle){
        motorcycle.accelerate();
    }
}
