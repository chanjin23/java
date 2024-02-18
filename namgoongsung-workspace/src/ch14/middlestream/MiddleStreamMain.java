package ch14.middlestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MiddleStreamMain {
    public static void main(String[] args) {
        //skip, limit, filter, distinct
        //건너뛰기,제한, predicate, 중복제거
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            list.add(i);
        }
//        Stream<Integer> stream = list.stream();
        list.stream().skip(3)
                .forEach((i) -> System.out.print(i + " "));
        System.out.println();

        list.stream().limit(5)
                .forEach((i) -> System.out.print(i + " "));
        System.out.println();

        list.stream().filter(i->i%2==0)
                .forEach((i) -> System.out.print(i + " "));
        System.out.println();

        list.add(2);    list.add(2);    list.add(2);

        list.stream().forEach((i) -> System.out.print(i + " "));
        System.out.println();

        list.stream().distinct()
                .forEach((i) -> System.out.print(i + " "));

    }
}
