package ch11.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set set = new TreeSet();    //정렬을 할필요없음. 탐색에 유리
//        Set set = new HashSet();  //탐색시 정렬을 해야함.
        //treeSet이므로 정렬이 되어서 처리 된다.

        for(int i=0;set.size()<6;++i){
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);   //set.add(new Integer(num));
            //Integer가 가지고있는 Comparable(정렬기준)을 가지고 있기때문에 Comparator가 없어도
            //에러가 나지않는다.
        }

        System.out.println(set);

    }
}

