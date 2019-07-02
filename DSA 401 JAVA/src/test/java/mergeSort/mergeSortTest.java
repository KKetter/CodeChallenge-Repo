package mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class mergeSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testMergeSort_emptyArr(){
        mergeSort potato = new mergeSort();
        int [] arr = new int[]{};
        potato.mergeSort(arr);
    }

    @Test
    public void testMergeSort(){
        mergeSort potato = new mergeSort();
        int [] arr = new int[]{2,6,9,4,0};
        int [] expectedOutput = new int[]{0,2,4,6,9};
        potato.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }
}