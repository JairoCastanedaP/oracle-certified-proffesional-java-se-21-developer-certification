package array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        System.out.println("-------------------Sorting double Array---------------------");
        //Sorting double array
        double [] array1= {2.3,11.0,4.6,-3.6,0.8,12};
        System.out.println("unsortered array: "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sorted array: "+ Arrays.toString(array1));

        System.out.println("-------------------Sorting int Array---------------------");
        //Sorting double array
        double [] array2= {5,6,9,4,-4,-7,-9};
        System.out.println("unsortered array2: "+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("sorted array2: "+ Arrays.toString(array2));

        System.out.println("-------------------Sorting char Array---------------------");
        //Sorting double array
        char [] array3= {'F','B','S','a','n'};
        System.out.println("unsortered array3: "+ Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("sorted array3: "+ Arrays.toString(array3));

        System.out.println("-------------------Sorting String Array---------------------");
        //Sorting double array
        String [] array4= {"halo","gears","gta","PES","COD"};
        System.out.println("unsortered array4: "+ Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println("sorted array4: "+ Arrays.toString(array4));

        System.out.println("-------------------Sorting String Array---------------------");
        //Sorting double array
        String [] array5= {"3","300","20","35","37","31","4","70", "ant", "Zebra"};
        System.out.println("unsortered array5: "+ Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println("sorted array5: "+ Arrays.toString(array5));
    }
}
