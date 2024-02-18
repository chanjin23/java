package ch12.generics;

import java.util.ArrayList;



public class GenericsMain {
    private static class Tv{ }
    private static class Audio{ }
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); //객체 데이터 타입과 생성자 데이터타입은 항상 같아야한다.
        list.add(new Tv());
//        list.add(new Audio());

        Tv t = list.get(0); //list의 첫번째 요소를 꺼낸다. 타입이 일치 하므로 형변환이 불필요

    }

}
