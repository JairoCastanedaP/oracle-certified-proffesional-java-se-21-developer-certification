package branching;

public class ReturnStatement {
    public static void main(String[] args) {
         int k =2;
         switch (k){

             case 1:
                 System.out.println("k is one");
                 break;
             case 2:
                 System.out.println("k is two");
                 return;
         }
        System.out.println("Outside the switch statement");
    }
}
