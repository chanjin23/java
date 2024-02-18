package ch11.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
//        list1.add(new Integer(5));  //원래는 컴파일러가 오토박싱을 자동으로해줘서 다음과같이 처리된다.
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

//        List list = list1.subList(1, 4);
//        ArrayList list2 = new ArrayList(list);    //길게 쓰면 이러헤 됨.
        ArrayList list2 = new ArrayList(list1.subList(1, 4));   //1<=x<4범위에 값을 추출한다. subList는 읽기 전용이다.
        print(list1, list2);

        //Collection은 인터페이스이고, Collections는 유틸 클래스 Math클래스 처럼 일종의 라이브러리.
        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
        //list2가 list1안에 전부 포함 되어있니?라고 물어보는것

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); //3번 인덱스 위치에 A가 들어가고 나머지 데이터들은 한칸씩 이동]
        //다음 메서드는 무리가 가는 작업이다.
        print(list1, list2);

        list2.set(3, "AA"); //값 바꾸기
        print(list1, list2);

        list1.add(0, "1");
        System.out.println("index=" + list1.indexOf(1));    //1이 들어있는 위치를 알려주세요
        print(list1, list2);

        list1.remove(1); //index 1에있는 객체를 삭제한다.
        print(list1, list2);

        list1.remove(new Integer(1));   //만약 1을 삭제하고싶으면 다음과 같이 처리해주면된다.
        list1.remove(new Integer(2));   //만약 2을 삭제하고싶으면 다음과 같이 처리해주면된다.
        print(list1, list2);

        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));  //list1과 list2가 겹치는 부분만 나타내준다.
        print(list1, list2);

        for(int i=list2.size()-1;i>=0;i--){
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        //1.get(i)로 list2에서 하나씩 꺼낸다.
        //2.conntains()로 꺼낸 객체가list1에 있는지확인
        //3. remove(i)로 해당객체를 list2에서 삭제
        print(list1, list2);
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
}
