package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(20);
        set1.add(40);
        set1.add(100);
        set1.remove(100);    //값 제거
//        set.clear(); //모든 값 제거
        //set1={10,20,40}

        HashSet<Integer> set2 =new HashSet<Integer>();
        set2.add(15);
        set2.add(25);
        set2.add(35);
        //set2 = {15,25,35}

        HashSet<Integer> set3 =new HashSet<Integer>();
        set3.add(10);
        set3.add(20);
        //set3 ={10,20}

        System.out.println(set1.containsAll(set2)); //set2가 set1에 속해있나요

//        set1.addAll(set2);    //set1 합집합 set2 을 set1에 넣어라
//        set1.retainAll(set2); //set1 교집합 set2
//        set1.removeAll(set2); //set1 차집합 set2

        Iterator iter =set1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
