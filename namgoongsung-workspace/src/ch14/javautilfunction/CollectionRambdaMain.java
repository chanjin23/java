package ch14.javautilfunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionRambdaMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }
        //0~ 9까지 list요소  추가

//        Iterator iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next()+",");
//        }   //다음과 같은식을 람다식 코드한줄로 간편하게 해결할 수 있음
//        System.out.println();

        //list의 모든요소출력
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        //list에서 2또는 3의 배수를 제거한다.
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        list.replaceAll(i -> i * 10);   //list에 각 요소에 10을 곱한다.
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");  map.put("2", "2");
        map.put("3", "3");  map.put("4", "4");  map.put("5", "5");

        map.forEach((k, v) -> System.out.print(k + ":" + v + "  "));
    }
}
