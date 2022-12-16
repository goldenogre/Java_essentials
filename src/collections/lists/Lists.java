package collections.lists;

import java.util.ArrayList;
import java.util.List;
public class Lists {
    // Lists are ordered like an array
    public static void main(String[] args) {
        // optional but helpful for loops
        // use <> and name the types <String, Integer>



        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits);

        System.out.println(fruits.get(2));
        System.out.println(fruits.set(2,"raspberry"));
        System.out.println(fruits); // apple rasp orange
        System.out.println(fruits.indexOf("lemon")); // 2
        System.out.println(fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("cat","dog"); // immutable
    }
}
