package collections.iterators;
/**
 * Iterators: Set List Queue but not Map have access to this method
 * Map uses enterySet();
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set items = new HashSet();

        items.add("heal");
        items.add("berry");
        items.add("sword");
        items.add("armor");
        // access collections
        var i = items.iterator(); // i = iterator
        while(i.hasNext()){
            System.out.println(i.next());
        }
        // iterating a map
        Map items2 = new HashMap();
        items2.put("heal", 0);
        items2.put("berry",3);
        items2.put("sword",1);
        items2.put("armor",2);

        Set items2AsSet = items2.entrySet();
        var j = items2.entrySet().iterator();

        while(j.hasNext()){
            Map.Entry entry = (Map.Entry)j.next();
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

    }
}
