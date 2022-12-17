package algorithms.sort;

/**
 * Classic Bubble sorting algorithm:
 * if value at an index is greater than the next index's value, swap. Once you reach the end
 * of the array, repeat the sort but decrement the length by one or you will make comparisons in the
 * sorted part of the array.
 *
 * In-Place Algorithm
 * O(n*2) Quadratic
 * Sorting is exponentially slower with every increase in length.
 */
public class Bubble {
    public static void bubbleSort(int[] array){
        System.out.println("Sorting with Bubble Sort");
        int length = array.length;

        for(int i = 0; i < length -1;i++){
            for(int j = 0; j < length - i - 1; j++){
                if(array[j]>array[j+1]){
                    swap(array,j, j+1);
                }
            }
        }

    }

    /**
     * Swaps values from two elements in an array
     * @param array The unsorted array
     * @param a
     * @param b
     */
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
