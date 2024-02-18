package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",1);
        map.put("one",100);
        map.put("two",2);
        map.put("three",3);

        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));

        iteratorUsingForEach(map);
        iteratorUsingIterator(map);
    }
    //map은 반복자 메서드 iterator를 제공하지않는다.
    //map 컨테이너의 값들을 추출하기 위해서는 entrySet()을 이용해야한다.

    static void iteratorUsingForEach(Map map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    //map메서드에 들어있는 entrySet()은 return반환타입이 set으로 되어있다.
    //map은 2개의 인자로 구성되어있기 때문에 Map.Entry를 통해서 값을 감싸 Set형식으로 만든다.
    //Entry를 통해서 getKey와 getValue를 이용해 key값과 value값을 출력할 수 있다.
    static void iteratorUsingIterator(Map map){
        Set<Map.Entry<String,Integer>> entries =map.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = entries.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    //마찬가지로 entrySet을 이용하여 변수를 하나 지정한다.
    //entrySet은 Set이므로 iterator를 반환타입을 하나만들어 생성한다.
    //순회 반복....
}
//Map은 수학에 함수와 유사하다.
//key값은 정의역, value값은 치역이 된다.