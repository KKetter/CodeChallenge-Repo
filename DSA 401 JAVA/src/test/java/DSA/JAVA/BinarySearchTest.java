/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DSA.JAVA;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class BinarySearchTest {
    @Test public void binarySearchTestPass() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("Binary search method should return'2'", classUnderTest.binarySearch(new int[]{2,3,4}, 2) == 0);
    }
    @Test public void binarySearchTestFail() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("Binary search method should return'-1'", classUnderTest.binarySearch(new int[]{2,3,4}, 5) == -1);
    }
    @Test public void binarySearchTestMidPass() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("Binary search method should return'1'", classUnderTest.binarySearch(new int[]{2,3,4}, 3) == 1);
    }

}
