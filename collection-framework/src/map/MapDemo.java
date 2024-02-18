package map;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",1);
        map.put("one",100);
        map.put("two",2);
        map.put("three",3);
        //map은 List와 Set과 다르게 key값과 value값 두개가 존재한다.
        //제너릭을 지정할 때 key, value 두 개가 존재하므로 인자타입을 두개를 받아야한다.
        //put메서드는 map에서만 있는 기능이다.
        //해당 value값을 얻고자 할때는 key값을 입력하면 value값이 나오게 된다.
        //주의할점 : key값은 중복 될수 없지만 value값은 중복될 수있다.
        //만약 같은 key값에 value값이 들어가면 value는 최신에 갱신된 value값이 들어가게된다.

        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
    }
}
