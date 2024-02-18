package ch14.stream;

import java.util.stream.IntStream;

public class RangeStreamMain {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5);    //1~4 출력
        intStream.forEach((i)-> System.out.print(i+" "));
    }
}
