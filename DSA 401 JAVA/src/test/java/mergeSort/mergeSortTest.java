package mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class mergeSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testMergeSort_emptyArr(){
        mergeSort potato = new mergeSort();
        int [] arr = new int[]{};
        potato.mergeSort(arr);
    }
}