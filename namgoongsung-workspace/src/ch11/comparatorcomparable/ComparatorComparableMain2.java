package ch11.comparatorcomparable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorComparableMain2 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new descending());
        System.out.println(Arrays.toString(strArr));
    }

    private static class descending implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Comparable && o2 instanceof Comparable){
                Comparable o11 = (Comparable) o1;
                Comparable o12 = (Comparable) o2;
                return o11.compareTo(o12)*-1;
            }
            return -1;
        }
    }
}
