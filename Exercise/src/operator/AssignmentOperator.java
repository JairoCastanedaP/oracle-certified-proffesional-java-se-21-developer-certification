package operator;

public class AssignmentOperator {

    public static void main(String[] args) {
        int x=20 , y=15, z=10;

        z=x+y;
        System.out.println("z = x + y -> "+ z);
        z=10;

        z+=x;
        System.out.println("z+=x ->" + z);
        z=10;

        z-=x;
        System.out.println("z-=x ->"+z);
        z=10;

        z*=x;
        System.out.println("z*=x ->"+ z);
        z=10;

        z/=x;
        System.out.println("z/=x ->"+ z);
        z=10;

        z%=x;
        System.out.println("z%=x ->"+ z);
        z=10;

    }
}
