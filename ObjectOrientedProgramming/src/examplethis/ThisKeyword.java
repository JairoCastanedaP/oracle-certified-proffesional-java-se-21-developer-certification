package examplethis;

public class ThisKeyword {

    String car;
    int year;

    public ThisKeyword(){
        this("BMW",2027);
    }
    public ThisKeyword(String car, int model){
        this.car=car;
        year=model;
    }

    public void printHello(){
        System.out.println("Hello");
        printWorld();
    }

    public void printWorld(){
        System.out.println("World");
    }

    public static void main(String[] args) {
        ThisKeyword myObject= new ThisKeyword("ferrari",2025);
        System.out.println("Car: "+ myObject.car);
        System.out.println("Year: "+ myObject.year);

        myObject.printHello();

        ThisKeyword myObThisKeyword= new ThisKeyword();
        System.out.println("Car: "+ myObThisKeyword.car);
        System.out.println("Year: "+ myObThisKeyword.year);
    }
}
