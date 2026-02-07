package inputoutput;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= input.nextInt();
        System.out.println("you entered "+ number);
        System.out.println("please enter a phrase");

        String a= input.next();
        System.out.println("you entered "+ a );
        System.out.println("please enter a phrase");
        String b=input.nextLine();
        System.out.println("you entered "+ b);
        input.close();
    }
}
