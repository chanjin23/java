package stream;

import java.util.stream.Stream;

public class StreamMain3 {
    public static void main(String[] args) {
        //of()메소드를 이용하면 가변 매개변수를 전달받아 스트림을 생성할 수 있다.
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream.forEach(e -> System.out.println(e));
    }
}
