//package DSA.JAVA;
//
//import java.util.Arrays;
//
//public class ArrayShift {
//    public static void main (String[] args) {
//
//        int[] inputArray = new int[] {1,2,4,5};
//        int inputInt = 3;
//
//        int[] endArr = arrayShift(inputArray, inputInt);
//        System.out.println(Arrays.toString(endArr));
//    }
//
//    public static int[] arrayShift(int[] inputArray, int inputInt) {
//            int midpoint = inputArray.length/2;
//            int[inputArray.length+1] shiftedArray;
//            for (int i = 0; i < midpoint;i++){
//                shiftedArray[i] = inputArray[i];
//        };
//            shiftedArray[midpoint] = inputInt;
//            for (int i = inputArray.length-1; i > midpoint;i--){
//            shiftedArray[i+1] = inputArray[i];
//        };
//        return shiftedArray;
//    }
//
//}
