package ch14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStreamMain {
    public static void main(String[] args) {
        //컬렉션은 stream을 인터페이스로 가지고있기때문에 list.stream() 가능
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();  //list를 Stream으로 생성
        intStream.forEach(System.out::print);   //메서드 참조
        //forEach는 최종연산이기 때문에 stream을 다시 생성해줘야 한다.
        System.out.println();

        intStream = list.stream();  //list로부터 Stream 재생성
        intStream.forEach((i) -> System.out.print(i));
        System.out.println();



    }
}
