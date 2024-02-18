package ch11.hashset;

import java.util.HashSet;

public class HashSetMain3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc"); //중복이라 저장안됨
        set.add(new Person("David",10));
        set.add(new Person("David",10));    //equals와 hashCode를 오버라이딩하지 않았기 때문에 HashSet이 중복

        System.out.println(set);
    }
}
