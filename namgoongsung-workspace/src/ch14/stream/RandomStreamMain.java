package ch14.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomStreamMain {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5);  //
        intStream.forEach(System.out::println);

        IntStream intStream2 = new Random().ints(5,10);  //5~9 랜덤 무한스트림
        intStream2.limit(3).forEach(System.out::println);
        System.out.println();

        IntStream intStream3 = new Random().ints(3,5,10);  //5~9 랜덤 무한스트림
        intStream3.forEach(System.out::println);
    }
}
