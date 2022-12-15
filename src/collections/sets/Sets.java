package collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Set is an interface and is unordered and any object
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        // adding apple would not produce a new record as the set must be unique
        System.out.println(fruits);

        System.out.println("have lemon? " + fruits.contains("lemon")); // will give boolean
        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: " + fruits.size());
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);

        // cost (immutable)
        moreFruit.add("cranberry");
        // can't remove() when using .of
    }
}
