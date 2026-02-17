package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter max sequence number");
        int number= input.nextInt();
        int fibPrevious=0, fibonacci=1, sum=1;

        // i=1    number=5
        for (int i = 1; i <=number ; i++) {
            System.out.print(fibPrevious +" ");
            sum= fibPrevious+fibonacci;
            //1st iteration-> sum=1
            fibPrevious= fibonacci;
            //1st iteration -> fibPrevious=1
            fibonacci=sum;
            //1st iteration -> fobonacci=1
        }
    }
}
