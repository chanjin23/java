package ch11.hashset;

import java.util.*;

public class HashSetMain2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i=0;set.size()<6;++i){
            int num = (int) (Math.random() * 45) + 1;   //random() 0<=x<1
            set.add(num);
        }

        System.out.println(set);    //set은 정렬을 할수 없기때문에 LinkedList를 이용
        System.out.println();

        List list = new LinkedList(set);    //1. set의 모든 요소를 List에 저장
        Collections.sort(list);             //2. List를 정렬
        System.out.println(list);           //3. list를 출력



    }
}
