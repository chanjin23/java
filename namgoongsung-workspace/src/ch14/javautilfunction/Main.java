package ch14.javautilfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i / 10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        list.forEach((i) -> System.out.print(i+ " "));
        System.out.println();
//        System.out.println(list);

        printEvenNum(p, c, list);
        
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    private static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<>(list.size());

        for (T t : list) {
            newList.add(f.apply(t));    //새로운 리스트에 람다식으로 적용된 값을 집어넣는다.
        }
        return newList;
    }

    private static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T t : list) {
            if(p.test(t)){
                //짝수인지 검사한다.
                c.accept(t);    //짝수이면 출력
            }

        }
        System.out.println("]");
    }

    private static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; ++i) {
            list.add(s.get());
        }
    }
}
