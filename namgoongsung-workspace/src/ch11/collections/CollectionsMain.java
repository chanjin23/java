package ch11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.*;


public class CollectionsMain {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);    //list에 1,2,3,4,5대입
        System.out.println(list);

        rotate(list, 2);    //오른쪽으로 두 칸씩 회전
        System.out.println(list);

        swap(list, 0, 2);   //첫번째와 세번째를 교환
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list, Collections.reverseOrder()); //역순 정렬reverse(list)
        System.out.println(list);

        sort(list); //정렬
        System.out.println(list);

        int idx = binarySearch(list, 3);    //3이 저장된 위치(index) 이진탐색
        System.out.println("index of 3= " + idx);

        System.out.println("max=" + max(list));
        System.out.println("min=" + min(list));
        System.out.println("min=" + max(list,reverseOrder()));

        fill(list, 9); //list를 9로 채운다
        System.out.println("list=" + list);

        //list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList= " + newList);

        System.out.println(disjoint(list, newList));//공통요소가 없으면 true로 반환
        //22222222222 999999999이기 때문에 true

        copy(list, newList);    //복사
        System.out.println("newList=" + newList);
        System.out.println("list=" + list);

        replaceAll(list, 2, 1); //2를 1로 전부 대체
        System.out.println("list=" + list);

        Enumeration e = enumeration(list);  //컬렉션 iterator랑 동일 배열에서는 Enumeration을 사용
        ArrayList list2 = list(e);

        System.out.println("list2=" + list2);
    }
}
