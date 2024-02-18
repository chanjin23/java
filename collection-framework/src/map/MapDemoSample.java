package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemoSample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("일", 1);
        map.put("이", 2);
        map.put("삼", 3);
        map.put("사", 4);

        System.out.println(map.get("일"));
        map.remove("일");
        Set set=map.entrySet();
        Iterator iter =set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
