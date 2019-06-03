package DSA.JAVA;

import java.util.Arrays;

public class ArrayShift {
    public static void main (String[] args) {

        int[] inputArray = new int[] {1,2,4,5};
        int inputInt = 3;

        int[] endArr = insertShiftArray(inputArray, inputInt);
        System.out.println(Arrays.toString(endArr));
    }

    public static int[] insertShiftArray(int[] inputArray, int inputInt) {
            int midpoint = (int)Math.ceil(inputArray.length/2.0);
            int[] shiftedArray = new int[inputArray.length+1];
            for (int i = 0; i < midpoint;i++){
                shiftedArray[i] = inputArray[i];
        };
            shiftedArray[midpoint] = inputInt;
            for (int i = inputArray.length-1; i >= midpoint;i--){
            shiftedArray[i+1] = inputArray[i];
        };
            System.out.println(Arrays.toString(shiftedArray));
        return shiftedArray;
    }

}
