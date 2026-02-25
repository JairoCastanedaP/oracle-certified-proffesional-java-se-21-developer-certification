package recordclasses;

public record Person() implements Drink {
    //static int age=10;

    @Override
    public void canDrink(String drinkName) {

    }
}
