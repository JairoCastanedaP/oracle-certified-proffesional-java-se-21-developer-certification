package operator;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int result= 5 + 2 * 4; //2*4= 8 ->5+8=13
        System.out.println("result = " + result);

        result= (5+2)*4; // 5+2=7 ->7*4=28
        System.out.println("result = " + result);

        result+=80/20%8*3+ -5; // 80/20= 4%8 ->4*3= 12 +-5=7 -> 28+7=35
        System.out.println("result = " + result);

        int x=8, y=4 , z=2, sum=0;
        sum=x+ --y + --z;// x=8 ,y=3 , z=1
        System.out.println("sum = " + sum);

        int a=3,b=6,c=9;
        int sum2=a + --a +(b*a);
        System.out.println("sum2 = " + sum2);

        int op= 2+5/2%7*4-2;
        System.out.println("op =2+5/2%7*4-2 = " + op);

        System.out.print(11/2);
        System.out.print(11/2.0);
        System.out.print(11%2);
        System.out.print(11%2.0);

        char c1='A';
        System.out.println(++c1);


    }
}
