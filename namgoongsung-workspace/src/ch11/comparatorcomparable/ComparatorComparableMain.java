package ch11.comparatorcomparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorComparableMain {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr/*, 정렬기준*/);    //원래는 정렬기준을 잡아줘야하는데 String내부에 Comparable메서드를 구현되어있기 때문에
        //String이 정렬기준을 자동으로 잡아준다.
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        //원래는 배열 대상과 정렬기준 2가지인자를 받아야한다.
        //워낙 자주사용하니까 상수로 만들어놓았음, Comparator
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr=" + Arrays.toString(strArr));
    }

    private static class Descending implements Comparator {
        public Descending() {
            super();    //Comparator의 기능들을 생성할때 사용
        }

        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                Comparable c1 = (Comparable) o1;
                Comparable c2 = (Comparable) o2;
                return c1.compareTo(c2) *-1; //내림차순으로 바꿔야하므로 음수로 설정해야한다.
            }
            //만약 해당 객체가 Comparable을 가지고있지않다면 -1을 반환
            return -1;
        }
    }
}
