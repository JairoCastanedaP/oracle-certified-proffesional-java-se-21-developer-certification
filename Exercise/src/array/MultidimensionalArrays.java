package array;

import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        // 2D Array
        int[][] twoDimArray = new int[3][3];// 3 1D array, size of each array is 3
        twoDimArray[0][0]=0;
        twoDimArray[0][1]=1;
        twoDimArray[0][2]=2;
        twoDimArray[1][0]=3;
        twoDimArray[1][1]=4;
        twoDimArray[1][2]=5;
        twoDimArray[2][0]=6;
        twoDimArray[2][1]=7;
        twoDimArray[2][2]=8;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimArray[i][j]);
            }
            System.out.println("");
        }



        System.out.println(Arrays.toString(twoDimArray[0]));
        System.out.println(Arrays.toString(twoDimArray[1]));
        System.out.println(Arrays.toString(twoDimArray[2]));

        System.out.println("twoDimArray: "+ Arrays.toString(twoDimArray));
        System.out.println("twoDimArray: "+ Arrays.deepToString(twoDimArray));

        System.out.println("------------------------------------------------------");

        int [][] ages={
                {2,20,6},
                {1,2},
                {30}
        };
        System.out.println("ages: "+ Arrays.deepToString(ages));
        System.out.println(Arrays.toString(ages[0]));
        System.out.println(Arrays.toString(ages[1]));
        System.out.println(Arrays.toString(ages[2]));

        //3D ARRAY

        char[][][] threeDimArray={ // 3D array
                {//first 2D array
                        {'a','b','c'},//first 1D array in first 2D array
                        {'d','e'},//second 1D array in first 2D array
                },
                {//second 2D array
                        {'f','g'},//first 1D array in first 2D array
                        {'h'},//second 1D array in first 2D array
                        {'s','g','2'},//second 1D array in first 2D array
                },
        };

        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray));
        System.out.println("first 2D array: " + Arrays.toString(threeDimArray[0]));
        System.out.println("second 2D array: " + Arrays.toString(threeDimArray[1]));

        System.out.println("threeDimArray: "+ Arrays.deepToString(threeDimArray));
    }
}