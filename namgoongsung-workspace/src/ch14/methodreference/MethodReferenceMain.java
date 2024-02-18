package ch14.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceMain {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//        Function<String, Integer> f =클래스이름::메서드이름;
        Function<String, Integer> f = Integer::parseInt;
//        Function<String, Integer> f = (s)->Integer.parseInt(s);
        System.out.println(f.apply("100") + 200);



    }

}
