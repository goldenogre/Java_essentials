package algorithms.sort;

/**
 * Divide and Conquer Algorithm
 * Recursive with 2 phases: Splitting and Merging
 * split is logical: new array not needed
 * merging uses temp array
 * Splitting:
 *      unsorted array:
 *          divide array in half. left and right
 *          keep splitting until all the arrays have only one element in the array: sorted
 * Merging:
 *      merge left/right pairs of sibling arrays into sorted array
 *
 *      O(nlogn) base 2. stable, not in place algorithm
 */
public class Merge {
    public static void mergeSort(int[] array, int start, int end){
        // base case
        if(end - start < 2){
            return;
        }
        // 1. partition array or sub-array
        int midpoint = (start + end) / 2;
        // left array
        mergeSort(array,start, midpoint);
        // right array;
        mergeSort(array, midpoint, end);
        // merge left right
        merge(array, start, midpoint, end);
    }
    public static void merge(int[] array, int start, int midpoint, int end){
        // optimized avoids step when both arrays are sorted.
        if(array[midpoint-1] <= array[midpoint]){
            return;
        }
        int i = start;
        int j = midpoint;
        int tempIndex = 0;
        int[] temp = new int[end-start]; // 0 - 10
        while(i < midpoint && j < end){
            temp[tempIndex++]= array[i]<=array[j] ? array[i++] : array[j++]; // <= preserves stable
        }
        // handle remaining elements (optimized) right elements will be in correct spot.
        System.arraycopy(array, i,array,start + tempIndex, midpoint - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
