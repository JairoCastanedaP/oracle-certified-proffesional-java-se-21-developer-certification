package finalkeyword;

import java.util.ArrayList;

public class FinalTest {

    public static final int Number=10;
    static ArrayList<String> animals = new ArrayList();
    public static void main(String[] args) {
        Car car= new Car();
        car.model="Ferrari";
        car.showMaxSpeed();

        //int number2= Number--;// error invalid usage

        int result= Number/2;
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fish");
        animals.add("Elephant");

        for (String a: animals){
            System.out.println(a);
        }

    }
}
