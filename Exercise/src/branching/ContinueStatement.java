package branching;

public class ContinueStatement {
    public static void main(String[] args) {

        //print even numbers from 10 to 0
        for (int num = 10; num >=0; num--) {
            if(num%2==0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
