import algorithms.search.ArraySearch;
import algorithms.string.ValidateString;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5,1,2,8,-2,1,4,88}; // unsorted array

        System.out.println(ArraySearch.linearSearch(numbers, 4));
        System.out.println(ArraySearch.linearSearch(numbers, 55));

    }
}
