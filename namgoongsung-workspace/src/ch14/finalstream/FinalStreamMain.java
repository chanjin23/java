package ch14.finalstream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FinalStreamMain {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Arrays.stream(strArr)
                .forEach(System.out::println);
        System.out.println();

        Stream.of(strArr)
                .parallel() //병렬로 처리하면 순서를 보장 받지 못한다.
                //멀티쓰레드처럼 여러 작업을 수행함
                .forEach(System.out::println);  //forEachOrdered를 쓰면 순서를 보장받을 수 있음 단 느려짐.
        System.out.println();

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0); //해당 조건식이 모두 거짓이면 true로 반환
        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's').findFirst();   //s로 시작하는 값 첫번째값 반환
        //findAny로 하면 s로 시작하는 값 아무 값 반환

        System.out.println("noEmptyStr=" + noEmptyStr);
        System.out.println("sWord=" + sWord.orElse("EMPTY"));

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);  //배열의 문자길이를 정수형으로 전환
        //Stream에서 변환할 때 map을 쓴다면 IntStream은 mapToInt를 사용해아 함.
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);  //요소가 있을 때마다 하나씩 증가 초기값 0
        int sum = intStream2.reduce(0, (a, b) -> a + b);    //요소를 하나씩 더해서 값을 더함
        OptionalInt max = intStream3.reduce((a, b) -> Math.max(a, b));
        OptionalInt min = intStream4.reduce(Math::min);
        System.out.println();

        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        System.out.println("max=" + max.orElse(-1));
        System.out.println("min=" + min.orElse(-1));
    }
}
