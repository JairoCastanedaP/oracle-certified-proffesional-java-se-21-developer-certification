package varexamples;

import java.util.function.Function;

public class VarExamples {

    class Var{

    }

    public static void var(){

    }
    //var age; compilation error

    public static void main(String[] args) {
        var num= 10;
        var name="Java";
        var animals= new String[5];

        var person= new Person();
        //var text =null;// compilation error

        var numbers= new int[5];

        //var with lambda
        Function<String, Integer> function = anyString.length();
        //var function = anyString -> = anyString.length(); // compilation error

    }
}
