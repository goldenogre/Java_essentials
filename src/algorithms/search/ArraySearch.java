package algorithms.search;

public class ArraySearch {
    /**
     * Search an INT array from 0 to nth index given a value
     * @param array Unsorted integer array
     * @param item The value to search for
     * @return boolean
     */
    public static boolean linearSearch(int[] array, int item){
        for(int value : array){
            if(value == item){
                return true;
            }
        }
        return false;
    }
}
