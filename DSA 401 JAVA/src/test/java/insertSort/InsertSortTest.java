package insertSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testInsertionSort_emptyArr(){
        InsertSort potato = new InsertSort();
        int [] arr = new int[]{};
        potato.InsertSort(arr);
    }

    @Test
    public void testInsertionSort(){
        InsertSort potato = new InsertSort();
        int [] arr = new int[]{2,6,9,4,0};
        int [] expectedOutput = new int[]{0,2,4,6,9};
        potato.InsertSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

}