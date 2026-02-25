package recordclasses;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainTest {

    public static void main(String[] args) {


        System.out.println("****************************************************WITH RECORD*****************************************");
        Person personOk = new Person("Jairo", 30);
        System.out.println("---------------getters----------------");
        System.out.println("name = " + personOk.name());
        System.out.println("age = " + personOk.age());

        //Person with constructor
        Person person2= new Person();
        System.out.println(person2.toString());

        //Person 3 class
        Person person3= new Person("Paul",-5);
        System.out.println(person3.toString());



        System.out.println("****************************************************WITHOUT RECORD*****************************************");
        PersonTwo person = new PersonTwo("Jairo",29);
        System.out.println("---------------getters----------------");

        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());

        System.out.println("---------------toString--------------------");
        System.out.println(person.toString());

        System.out.println("-----------equals() and hashCode()---------");
        PersonTwo personv2 = new PersonTwo("Jairo",29);

        System.out.println("is persons are same? "+ personv2.equals(person2));
        System.out.println("Hash code of person: "+ personv2.hashCode());
        System.out.println("Hash code of person2: "+ personv2.hashCode());

    }
}
