package insertSort;

public class InsertSort {

    public static void InsertSort(int [] array){
        //handle empty array sort
        if(array.length == 0){
            throw new IllegalArgumentException("Can not sort empty array.");
        }
        //insert sort logic, left to right
        for(int i = 1; i < array.length; i++){
            int j = i - 1;
            int key = array[i];
        //move elements that are greater than key to one position ahead of current position
            while(j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                j = j-1;

            }
            array[j + 1] = key;
        }
    }
}
