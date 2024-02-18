package ch11.hashmap;

import java.util.*;

public class HashMapMain2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();    //Map인터페이스안에 Entry인터페이스가 구현되어있다.
            System.out.println("이름: " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values =map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i =(Integer)it.next();
            total+=i.intValue();
//            total+=(int)it.next(); //이렇게해도됨.
        }

        System.out.println("총점: " + total);
        System.out.println("평균: " + (float) total / set.size());
        System.out.println("최고점수: "+Collections.max(values));   //values의 값중 최대
        System.out.println("최고점수: "+Collections.min(values));   //values의 값중 최소
    }
}
