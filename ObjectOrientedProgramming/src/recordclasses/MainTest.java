package recordclasses;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainTest {

    public static void main(String[] args) {

        PersonTwo person = new PersonTwo("Jairo",29);
        System.out.println("---------------getters----------------");

        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());

        System.out.println("---------------toString--------------------");
        System.out.println(person.toString());

        System.out.println("-----------equals() and hashCode()---------");
        PersonTwo person2 = new PersonTwo("Jairo",29);

        System.out.println("is persons are same? "+ person.equals(person2));
        System.out.println("Hash code of person: "+ person.hashCode());
        System.out.println("Hash code of person2: "+ person2.hashCode());

    }
}
