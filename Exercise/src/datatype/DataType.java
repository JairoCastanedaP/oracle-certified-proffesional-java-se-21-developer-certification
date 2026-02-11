package datatype;

public class DataType {

    public static void main(String[] args) {

        boolean a=true;
        char b='R';
        byte c='3';
        char unicode = '\u03A9';
        short d=-365;
        int e = 43543;
        long f= 98765432189L;
        float g=9876.1254F;
        double h = 98641.541245;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("unicode = " + unicode);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //String class
        String str1 = "This is a string";
        System.out.println("str1 = " + str1);

        //Some tips
        Long money= 98715454545_4545454L;

        float float1= 4_5.245468F;

        System.out.println("money = " + money);
        System.out.println("float1 = " + float1);

    }
}
