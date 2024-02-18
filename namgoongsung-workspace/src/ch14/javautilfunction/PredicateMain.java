package ch14.javautilfunction;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); //문자열 입력을 16진수로 반환
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i); //2진수 변환

        Function<String, String> h = f.andThen(g); //f를 처리하고 g를 처리하는방식
        Function<Integer, Integer> h2 = f.compose(g); //g를 처리하고 f를 처리하는 방식

        System.out.println(h.apply("FF"));  //"FF" -> 255 -> "1111111"
        System.out.println(h2.apply(2)); //2 -> "10" -> 16

        Function<String, String> f2 = x -> x;   //항등함수
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); //i>=100

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));  //T && T ==T

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2); //str1.equal(str2)
        System.out.println(result);
    }
}
