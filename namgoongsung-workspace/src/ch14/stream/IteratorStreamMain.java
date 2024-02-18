package ch14.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IteratorStreamMain {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);  //seed가 0인 무한스트림
        intStream.limit(5).forEach(System.out::println);
        System.out.println();

        //generate는 Supplier여서 입력이 없고 출력만 있다.
        Stream<Integer> intStream2 = Stream.generate(() -> (int)(Math.random()*10)+1);
        intStream2.limit(10).forEach(System.out::println);

//        IntStream intStream3 = Stream.iterate(0, n -> n + 2);  //IntStream은 안되네??
//        intStream3.limit(5).forEach(System.out::println);
    }
}
