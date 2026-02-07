package comments;

public class JavaComments {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
        *
        *This is the multi-line comment in Java
        *
        * */

        //This is a comment in Java
        //
        System.out.println("Hello Java Developers");

        int multiplication= doMultiplication(3,4);
        System.out.println("3*4= "+multiplication);
    }

    /**
     * This method multiplies two integer values
     * @param x is the first parameter
     * @param y is the second parameter
     * @return This method return the multiplication of the x and y
     */
    public static int doMultiplication(int x, int y){
        return x*y;
    }
}
