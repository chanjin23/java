package ch14.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalIfPresentMain {
    public static void main(String[] args) {
        Optional<String> optSTr = Optional.of("abcde");
        Optional<Integer> optInt = optSTr.map(String::length);
        //Optional에 map메서드가 들어가 있어서 다음과 같이String을  Integer로 바꿀 수 있다.
        System.out.println("optStr=" + optSTr.orElse("EMPTY"));
        System.out.println("optInt=" + optInt.orElse(-1));

        int result1 = Optional.of("123")    //Optional로 감싼 String 123생성
                .filter(x -> x.length() > 0)    //문자 길이가 0보다 큰값만 필터
                .map(Integer::parseInt).orElse(-1);  //String을 int로 전환
        //값 꺼내오기 만약 값이 null이면 -1반환

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(System.out::println);    //값이 null이 아니면 출력

        OptionalInt optionalInt1 = OptionalInt.of(0);   //0 저장
        OptionalInt optionalInt2 = OptionalInt.empty(); //빈 객체 저장

        System.out.println(optionalInt1.isPresent());   //값이 있으므로 true
        System.out.println(optionalInt2.isPresent());   //값이 없으므로 false

        System.out.println(optionalInt1.getAsInt());    //OptionalInt로 타입을 받을땐 get이 아니라 getAsInt로 반환
        System.out.println(optionalInt2.orElse(-1));    //OptionalInt로 타입을 받을땐 get이 아니라 getAsInt로 반환

    }
}
