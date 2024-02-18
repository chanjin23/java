package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"하나", "둘", "셋", "넷"};

        //배열에 관한 스트림을 생성하기 위해서는 Arrays클래스에는 다양한 형태의 stream() 메소드가 클래스메소드로 정의되어 있다.
//        Stream<String> stream1 = Arrays.stream(arr);
        Stream<String> stream1 = Stream.of(arr);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        //배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 2);
        stream2.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
