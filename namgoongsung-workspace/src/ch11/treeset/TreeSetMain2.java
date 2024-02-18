package ch11.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain2 {
    public static void main(String[] args) {
        Set set = new TreeSet(new TestComp());    //정렬을 할필요없음. 탐색에 유리
        //새로운 비교기준을 넣어준다.
//        Set set = new HashSet();  //탐색시 정렬을 해야함.
        //treeSet이므로 정렬이 되어서 처리 된다.

        set.add(new Test());
//        set.add(new Test());
//        for(int i=0;set.size()<6;++i){
//            int num = (int) (Math.random() * 45) + 1;
//            set.add(new Test());
//        }

        System.out.println(set);

    }
    private static class Test{  // 비교기준이없다. 그래서 비교기준을하나 만들어줘야한다.
        //만약 Comparator가 필요없으려면 Test에 Comparable을 직접 구현해줘야한다.

    }

    private static class TestComp implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}

