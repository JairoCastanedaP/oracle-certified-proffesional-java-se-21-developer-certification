package boxing;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        Double db= 12.8;//Auto Boxing of Double
        double  d= db;//Auto-unboxing of double

        System.out.println("db = " + db);
        System.out.println("d = " + d);

        Integer in =5;//Auto boxing of int
        int i=in;//Auto unboxing of integer
        System.out.println("in = " + in);
        System.out.println("i = " + i);

        Character ch= 'b';//Auto boxing of char
        char c= ch;//auto unboxing of character;
        System.out.println("ch = " + ch);
        System.out.println("c = " + c);

        Integer  integer1= 1;
        //int int1= (Integer)null; //throws NullPointerException at runtime

    }
}
