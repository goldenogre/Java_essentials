package collections.enhanced_loops;

import java.util.HashMap;
import java.util.Map;

public class ForEachWithLambdas {
    public static void main(String[] args) {
        Map<String, Integer> powerLevel = new HashMap<>();
        powerLevel.put("goku", 4000);
        powerLevel.put("Gohan", 9001);

        powerLevel.forEach((k,v)-> System.out.println(k + ":" + v));
    }
}
