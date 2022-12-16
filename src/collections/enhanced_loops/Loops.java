package collections.enhanced_loops;
// Enhanced loop and forEach method and lambda
import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

       // fruits.forEach(f-> System.out.println(f));
       // fruits.forEach(System.out::println);
        fruits.forEach(f->{
            f = "fruits " + f;
            System.out.println(f);
        });

//        for(String fruit: fruits){
//            System.out.print(fruit + " ");
//        }
    }
}
