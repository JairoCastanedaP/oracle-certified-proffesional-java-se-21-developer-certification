package nestedclasses;

import nestedclasses.Person.StaticPerson;
public class StaticNestedTest {

    public static void main(String[] args) {
        //Person.StaticPerson person=new Person.StaticPerson();
        StaticPerson person=new StaticPerson();
        person.show();
    }
}
