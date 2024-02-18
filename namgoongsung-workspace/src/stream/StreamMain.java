package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::println/*메서드 참조*/);

        stream= list.stream();
        stream.forEach(n-> System.out.println(n));

    }
}
