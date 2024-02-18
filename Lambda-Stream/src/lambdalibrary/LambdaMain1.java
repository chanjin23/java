package lambdalibrary;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaMain1 {
    public static void main(String[] args) {
        //반환 값만 존재
        Supplier<Integer> f1 = () -> {
            int a = 100;
            return a;
        };
        System.out.println(f1.get());

        //인자타입만 있고 반환값은 없음
        Consumer<Integer> f2= (a) -> {
            a = 10;
            //반환하지는 않음
        };


    }
}
