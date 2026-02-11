package inputoutput;

import java.util.Scanner;

class Customer{


    private String firstName;
    private String lastName;

    public static void main(String[] args){


        Customer customer= new Customer();
        customer.getFullName();
    }

    public Customer(){
    }
    public String getFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        firstName= scanner.nextLine();
        System.out.println("Ingrese el apellido");
        lastName= scanner.nextLine();

        return firstName+ lastName;
    }
}