package operator;

public class BitwiseBitshiftOperator {
    public static void main(String[] args) {

        System.out.println("-------------Bitwise AND (&) Operator-----------------");

        //Bitwise AND (&)

        int num1=8; //1000
        int num2=9; //1001
                    //1000 ->8 in decimal

        System.out.println("num1 in binary: "+ Integer.toBinaryString(num1));
        System.out.println("num2 in binary: "+ Integer.toBinaryString(num2));
        System.out.println("num1 & num2 in binary: "+ Integer.toBinaryString(num1 & num2));
        System.out.println("num1 & num2 in decimal: "+ (num1 & num2));

        System.out.println("-------------Bitwise Inclusive OR (|) Operator-----------------");

        //Bitwise AND (&)

        int num3=8; //1000
        int num4=9; //1001
                    //1001 ->9 in decimal

        System.out.println("num3 in binary: "+ Integer.toBinaryString(num1));
        System.out.println("num4 in binary: "+ Integer.toBinaryString(num2));
        System.out.println("num3 | num2 in binary: "+ Integer.toBinaryString(num1 | num2));
        System.out.println("num3 | num2 in decimal: "+ (num3 | num2));

        System.out.println("-------------Bitwise Exclusive OR (^) Operator-----------------");

        //Bitwise AND (&)

        int num5=8; //1000
        int num6=9; //1001
                    //0001 ->1 in decimal

        System.out.println("num5 in binary: "+ Integer.toBinaryString(num5));
        System.out.println("num6 in binary: "+ Integer.toBinaryString(num6));
        System.out.println("num5 ^ num6 in binary: "+ Integer.toBinaryString(num5 ^ num6));
        System.out.println("num5 ^ num6 in decimal: "+ (num5 ^ num6));

        System.out.println("-------------Signed Left-shift (<<) Operator-----------------");

        int num7 =8; //1000 <<2 -> 100000 -> 21 in decimal

        System.out.println("num7 in binary :"+ Integer.toBinaryString(num7));
        System.out.println("num7 <<2 in binary: "+ Integer.toBinaryString(num7<<2));
        System.out.println("num7 << 2 : " + (num7<<2));



        System.out.println("-------------Signed Right-shift (>>) Operator-----------------");

        int num8 =8; //1000 >>2 -> 10 -> 2 in decimal

        System.out.println("num8 in binary :"+ Integer.toBinaryString(num8));
        System.out.println("num8 >> 2 in binary: "+ Integer.toBinaryString(num8>>2));
        System.out.println("num8 >> 2 : " + (num7>>2));

        System.out.println("-------------Unary Bitwise Complement (~) Operator-----------------");

        int num9=8; // ~1000 -> 0111 -> 7 in decimal

        System.out.println("num9 in binary :"+ Integer.toBinaryString(num9));
        System.out.println("~num9 in binary: "+ Integer.toBinaryString(~num9));
        System.out.println("~num9  : " + (~num9));

    }
}
