package collections.queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // same order in the list fifo
        Queue family = new LinkedList<>();
        family.add("Damian");
        family.add("Kelly");
        family.add("Drake");
        family.add("Devin");
        family.add("madeleine");

        var removed = family.remove();
        System.out.println(family);
        System.out.println(removed);
        System.out.println("Peeking at next head: " + family.peek());
    }
}
