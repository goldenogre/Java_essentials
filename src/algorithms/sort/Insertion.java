package algorithms.sort;

public class Insertion {
    public static void insertionSort(int[] array){
        int length = array.length;
        // i = first unsorted index
        for(int i = 1; i < length;i++){
            int key = array[i]; // represents...
            int j = i-1; // this represents the slot to replace

            while(j >= 0 && array[j]> key){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}
