package array;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        int[] numbers ={0,2,4,6,8,10};
        int indexOfEight = Arrays.binarySearch(numbers,8);//4
        System.out.println("index of 8: "+ indexOfEight);

        int indexOfSeven = Arrays.binarySearch(numbers,7);//-5
        System.out.println("index of 7: "+ indexOfSeven);

        int[] numbers2={0,12,4,16,18,10};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        int indexOfFour= Arrays.binarySearch(numbers2, 4);
        System.out.println("indexOfFour: "+ indexOfFour);


        String[] animals= {"Cat","Cow","Dog", "Elephant", "Lion", "mONKEY"};
        int indexOfDog= Arrays.binarySearch(animals,"Dog");
        System.out.println("indexOfDog = " + indexOfDog);
    }
}
