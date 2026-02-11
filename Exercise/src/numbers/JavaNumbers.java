package numbers;

public class JavaNumbers {
    public static void main(String[] args) {

        System.out.println("-----------------------OCTAL NUMBERS---------------------------------");
        //OCTAL
        //0-7
        int octalNumber1= 015;// This will be stored as 13 in decimal
        int octalNumber2=0104;//Thos will be stored as 68 in decimal
        int sumOctalNumbers= octalNumber1 + octalNumber2;//81 in decimal

        System.out.println("octalNumber1 = " + octalNumber1);
        System.out.println("octalNumber2 = " + octalNumber2);
        System.out.println("sumOctalNumbers = " + sumOctalNumbers);
        System.out.println("result in Octal = " + Integer.toOctalString(sumOctalNumbers));

        System.out.println("-----------------------HEXADECIMAL NUMBERS---------------------------------");
        //Hexadecimal
        int hexNumber1=0X1B0;//432 in decimal
        int hexNumber2= 0X2F;//0-9 A-F //47 in decimal
        int sumHexNumbers= hexNumber1+hexNumber2;//479 in decimal

        System.out.println("hexNumber1 = " + hexNumber1);
        System.out.println("hexNumber2 = " + hexNumber2);
        System.out.println("sumHexNumbers = " + sumHexNumbers);
        System.out.println("result a Octal = " + Integer.toHexString(sumHexNumbers));

        System.out.println("-----------------------BINARY NUMBERS---------------------------------");
        //Binary
        int binaryNumber1= 0b1001;//9 in decimal
        int binaryNumber2= 0B1011;//11 IN DECIMAL

        int sumBinaryNumbers= binaryNumber1+binaryNumber2;//20 in decimal

        System.out.println("binaryNumber1 = " + binaryNumber1);
        System.out.println("binaryNumber2 = " + binaryNumber2);
        System.out.println("sumBinaryNumbers = " + sumBinaryNumbers);
        System.out.println("result as Binary = " + Integer.toBinaryString(sumBinaryNumbers));

    }
}
