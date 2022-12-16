package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // no add, use 'put' key:value
        // unordered as well
        // access by key: unique
        Map immutable = Map.of(
          "bob", 4,
          "dan", 6
        );
        Map items = new HashMap();
        items.put("heal", 0);
        items.put("berry",3);
        items.put("sword",1);
        items.put("armor",2);
        items.put("berry",6); // overrides value use putIfAbsent() will ignore if key exhists

        System.out.println("Heals in stock: " + items.get("heal"));
        System.out.println(items.containsKey("poison"));
        System.out.println(items.containsKey("berry"));
        System.out.println(items.containsValue(6));
        System.out.println(items.containsValue(4));

        System.out.println(items);
    }
}
