package ch14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStreamMain2 {
    public static void main(String[] args) {

        //객체 배열을 선언할 때는 Arrays. 이나 Stream.of를 활용하여 스트림 생성
//        Stream<String> strStream = Stream.of("a", "b", "c");    //값을 직접 넣어주는 방법도 있음
        String[] strArr = new String[]{"a", "b", "c", "d"};
//        Stream<String> strStream = Stream.of(strArr); // 둘이 똑같음
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach((i) -> System.out.print(i + " "));
        System.out.println();

        //기본형 스트림을 이용하는 방법
        //배열 객체를 사용할 떄는 IntStream이 좋다.
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach((i) -> System.out.print(i +" "));
        System.out.println();

        intStream = Arrays.stream(intArr);
        System.out.println("count=" + intStream.count());   //최종연산

        intStream = Arrays.stream(intArr);
        System.out.println("sum=" + intStream.sum());   //최종연산

        intStream = Arrays.stream(intArr);
        System.out.println("average=" + intStream.average());   //최종연산
        //기본형 스트림을 하는 경우 다음과 같이 intStream을 사용하면 count(), sum() ,average() 등 많은 메서드들을 제공받을 수 있다.

        Integer[] integerArr = {1, 2, 3, 4, 5};
        Stream<Integer> intStream2 = Stream.of(integerArr);
        //만약 Stream<Integer> 를 사용하고싶다면 해당 배열의 타입이 int가 아닌 Integer여야 한다.
        //Stream을 사용하게 되면 sum, average같은 메서드들을 사용할 수 없다.



    }
}
