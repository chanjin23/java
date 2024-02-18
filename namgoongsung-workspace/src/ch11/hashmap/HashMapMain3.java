package ch11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMain3 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "K", "A", "Z", "Z", "Z", "D", "A", "A", "Z", "Z", "A", "A"};

        HashMap map = new HashMap();
        for (String s : data) {
            if (map.containsKey(s)) {   //1씩 추가
                int value = (int) map.get(s);
                map.put(s, value + 1);
            } else {
                map.put(s, 1);  //초기 값 설정
            }
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = (int) entry.getValue();
            System.out.println(entry.getKey()+" :"+ printBar('#',value)+" " + value);
        }
    }

    private static String printBar(char c, int value) {
        char[] bar = new char[value];
        for(int i=0;i<bar.length;++i){
            bar[i]=c;
        }
        return new String(bar); //char를 String으로 바꾸는 생성자
    }
}
