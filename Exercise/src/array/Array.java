package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numberArray; //declaration
        int sum;
        //instantiation and initialization
        numberArray =  new int[5];//
        sum=0;

        numberArray[0] = 5;
        //numberArray[1]=-4;
        numberArray[2]=7;
        numberArray[3]= 2;
        numberArray[4]=-3;

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("numberArray["+i+"] = " + numberArray[i]);
            sum+=numberArray[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("numberArray: "+ Arrays.toString(numberArray));
        System.out.println("length of the numberArray: "+ numberArray.length);

        int ages[]= new int[]{15,(int)16.5,17};
        System.out.println("ages"+ Arrays.toString(ages));

        Object[] miexedArray= {3,5.7,5.8F,"CAT", 'h', false};
        System.out.println("mixedArray: "+ Arrays.toString(miexedArray));
    }
}
