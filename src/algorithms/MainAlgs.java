package algorithms;

import algorithms.sort.Bubble;
import algorithms.sort.Selection;

public class MainAlgs {
    public static void main(String[] args) {
        int[] unsortedArray = {65,1,24,5,-3,22,6};
        print(unsortedArray);
        Selection.selectionSort(unsortedArray);
        print(unsortedArray);

    }
    public static void print(int[] a){
        for(int x:a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
