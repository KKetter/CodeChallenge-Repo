package quickSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class quickSortTest {

    @Test
    public void quickSort() {
        quickSort potato = new quickSort();
        int [] arr = new int[]{2,6,9,4,0};
        int [] expectedOutput = new int[]{0,2,4,6,9};
        potato.quickSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }
}