package stringclassexample;

public class StringExample {

    public static void main(String[] args) {

        //String literal
        String stringLiteral1= "Hello";
        String stringLiteral2= "World";

        System.out.println("stringLiteral1 = " + stringLiteral1);
        System.out.println("stringLiteral2 = " + stringLiteral2);

        //String object
        String stringObject1= new String("Hello");
        String stringObject2= new String("World");

        System.out.println("stringObject1 = " + stringObject1);
        System.out.println("stringObject2 = " + stringObject2);

        //Concatenate string with + sign
        System.out.println(stringLiteral1+ " " + stringLiteral2);
        System.out.println(stringObject1+ " " + stringObject2);

        String concatenatedStringLiteral= stringLiteral1 + " "+ stringLiteral2;
        String concatenateStringObject= stringObject1+ " "+ stringObject2;

        System.out.println("concatenatedStringLiteral = " + concatenatedStringLiteral);
        System.out.println("concatenateStringObject = " + concatenateStringObject);

        String stringNum1= "3";
        String stringNum2= "4";
        System.out.println(stringNum1+ stringNum2);

        int num1=5;
        int num2=6;

        System.out.println(num1+num2);
        System.out.println(stringNum1+num1);

        System.out.println(4+5+"6");
        System.out.println(4+"5"+6);
        System.out.println("4"+5+6);

    }
}
