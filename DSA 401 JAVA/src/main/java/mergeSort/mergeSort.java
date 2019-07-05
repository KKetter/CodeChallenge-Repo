package mergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

//primary reference: https://www.geeksforgeeks.org/merge-sort/
public class mergeSort {

    public static int[] merge(int[] array, int[] l, int[] r){
        // Merge the temp arrays
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length)
        {
            if (l[i] <= r[j])
            {
                array[k] = l[i];
                i++;
            }
            else
            {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length)
        {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length)
        {
            array[k] = r[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] mergeSort(int[] array){
        //handle empty array sort
        if(array.length == 0){
            throw new IllegalArgumentException("Can not sort empty array.");
        }
        if(array.length > 1){
            int n = array.length;
            int m = n/2;
            int[] l = new int[m];
            int[] r = new int[n-m];
            //fill the arrays
            //Copy data to temp arrays
            for (int i=0; i<l.length; ++i)
                l[i] = array[i];
            for (int j=0; j<r.length; ++j)
                r[j] = array[j+m];
            // Sort left and right half arrays - recursive
            // Merge the sorted halves
            return merge(array, mergeSort(l), mergeSort(r));
        }
        else return array;
    }


}
