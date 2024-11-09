import org.example.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QickSortTesting {

    @Test
    public void testSortNormalArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr, "Array should be sorted in ascending order");
    }


    @Test
    public void testSortArrayWithOutOfRangeIndices() {
        int[] arr = {5, 3, 8, 1, 2};


        // Test case where low is negative (invalid index)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            QuickSort.quickSort(arr, -1, arr.length - 1); // Invalid index: low < 0
        }, "QuickSort should throw ArrayIndexOutOfBoundsException when low is negative");


    }


    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr, "Empty array should remain empty");
    }

    @Test
    public void testIdempotency() {
        int[] arr = {4, 2, 5, 1, 3};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr, "First sorting should give sorted array");


        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr, "Second sorting should give same sorted array");
    }

}
