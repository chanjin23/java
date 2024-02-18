package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> map =new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        Collection collections =  map.values();
        System.out.println(collections);
    }
}
