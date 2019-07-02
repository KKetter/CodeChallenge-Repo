package mergeSort;
//primary reference: https://www.geeksforgeeks.org/merge-sort/
public class mergeSort {

    public static int[] merge(int[] array, int[] l, int[] r){
        // Create temp arrays w/ size from lines 7,8
        int leftArr[] = new int [l.length];
        int rightArr[] = new int [r.length];

        //Copy data to temp arrays
        for (int i=0; i<l.length; ++i)
            leftArr[i] = array[l.length + i];
        for (int j=0; j<r.length; ++j)
            //unsure if array length is correct here...might be -1...ugh
            rightArr[j] = array[r.length + j];

        // Merge the temp arrays
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length)
        {
            if (leftArr[i] <= rightArr[j])
            {
                array[k] = leftArr[i];
                i++;
            }
            else
            {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < l.length)
        {
            array[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < r.length)
        {
            array[k] = rightArr[j];
            j++;
            k++;
        }
        return array;
    }

    public static void mergeSort(int[] array){
        int n = array.length;
        //handle empty array sort
        if(array.length == 0){
            throw new IllegalArgumentException("Can not sort empty array.");
        }
        if(array.length > 1){
            int m = n/2;
            int[] l = new int[m-0];
            int[] r = new int[n-m];
            // Sort left and right half arrays - recursive
            mergeSort(l);
            mergeSort(r);

            // Merge the sorted halves
            merge(array, l, r);
        }


    }


}
