package ch11.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4", "4"};
        Set set = new HashSet();

        for(int i=0;i<objArr.length;++i){
            System.out.println(objArr[i]+"="+set.add(objArr[i]));
            //값이 중복되면 false를 반환한다.
        }

        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {  //읽어올 요소가 남아있는지 확인
            System.out.println(it.next());  //요소하나 꺼내오기
        }

    }
}
