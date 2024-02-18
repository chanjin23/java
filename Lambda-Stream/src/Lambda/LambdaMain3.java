package Lambda;

import java.util.*;

public class LambdaMain3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "ddd", "bbb", "aaa");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        //다음을 람다식으로 바꾸면 다음과 같다.
        List<String> list2 = Arrays.asList("abc", "aaa", "ddd", "bbb", "aaa");
        Collections.sort(list, ((o1, o2) -> o2.compareTo(o1)));

    }
}
