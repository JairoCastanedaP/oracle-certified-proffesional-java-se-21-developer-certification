package method;

public class MethodExample {

    public static void main(String[] args) {
        System.out.println("sum: "+ add(5,4));
    }

    public static int add(int num1, int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }
}
