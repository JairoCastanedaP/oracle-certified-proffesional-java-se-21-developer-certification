package recordclasses;

public record Person(String name, int age) implements Drink {
    //static int age=10;

    public Person(){
        this(null,0);
    }


    //Compact canonical constructor
    public Person{
        if(age<0){
            System.out.println("Age cannot be negative");
        }
    }
    @Override
    public void canDrink(String drinkName) {

    }
}
