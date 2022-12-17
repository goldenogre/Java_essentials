package algorithms.sort;
/**
 * Selection sorting algorithm:
 * Find the largest value and store it and swap it with the last value in the array if it's higher, then
 * repeat while decrementing the next iteration like bubbleSort since that part of the array is already sorted.
 *
 * In-Place Algorithm
 * O(n*2) Quadratic
 * Sorting is exponentially slower with every increase in length.
 */
public class Selection {

    /** This version finds the smallest value and swaps it into the first index
     *  The first loop starts at 0 and stops at n-1. 0 I is considered sorted partition.
     *  The second loops starts at the very next index after I and will swap with the smallest value found
     *  Swap method does the work.
     */
    public static void selectionSort(int[] array){
        int length = array.length;

        for(int i = 0; i < length - 1; i++){
            int index_min_value = i;// use index
            for(int j = i + 1; j < length;j++){
                if(array[j]<array[index_min_value]){
                    index_min_value = j;
                }
            }
            swap(array,index_min_value,i);
        }
    }
    private static void swap(int[] array, int a, int b){
        // Shouldn't happen due to comparison operator
        if(a==b){
            return;
        }
        // Safely stores and swaps data
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

}


