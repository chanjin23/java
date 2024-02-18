package ch9.boxing;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);  //JDK1.5이전에는 에러
        list.add(new Integer(100)); //더 이상 자바에서 래퍼로 감싸는 행위를 막고있다. 허나 실행은 정상적으로 작동함.

        Integer i = list.get(0); //list에서 저장된 첫번째 객체르 꺼낸다.
        int i2 = list.get(0).intValue(); //원래는  타입이 맞지 않아 intValue 를 통해서 언박싱을 해야한다.
        int i3 = list.get(0); //컴파일러가 자동으로 언박싱해줘서 안해도 됨.

    }
}
