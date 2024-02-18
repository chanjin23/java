package ch14.middlestream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStreamMain {
    public static void main(String[] args) {
        //스트림 안에 배열 객체가 있을 때 해당 값을 뽑고 싶다면 flatMap을 사용하면된다.
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );

//        Stream<Stream<String>> strStrmStrm = strArrStrm.map(i->Arrays.stream(i));
        //Arrays는 스태틱 메서드이므로 스태틱 메서드참조를 이용
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toUpperCase)    //소문자 변환
                .distinct() //중복제거
                .sorted()   //정렬
                .forEach(System.out::println);  //출력
        System.out.println();

        //단어를 뽑고싶을 때도 flatMap을 사용하면된다.
        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };
//        Stream<String> lineStream = Arrays.stream(lineArr);
        Stream<String> lineStream = Stream.of(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split( " +")))    //" +"하나 이상의 공백을 의미함
                //정규식(Regular Expression 공백이 하나 이상일때도 쪼갤 수 있게
                //split으로 쪼개면 하나의 배열이 생성된다.
                .map(s->s.toLowerCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
