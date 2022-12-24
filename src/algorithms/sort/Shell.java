package algorithms.sort;

public class Shell {
    /**
     * Variation of Insertion sort
     * unstable-Inplace- complexity is determined by gap. n^2 is worse.
     * Uses a larger gap value and reduces as it runs to optimize shifting.
     * Knuth sequence gap value near size of array.(3^k-1)/2
     */
    public static void shellSort(int[] array){
        for(int gap = array.length / 2; gap > 0; gap/= 2){
            // compare and shift
            for(int i = gap; i < array.length;i++){
                int newElement = array[i];
                int j = i; // traverse
                while(j>=gap && array[j-gap]>newElement){
                    array[j]= array[j-gap]; // shift up gap positions
                    j-=gap; // keeps going back by GAP positions away.
                }
                array[j]= newElement;
            }
        }
    }
}
