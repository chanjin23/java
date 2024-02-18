package ch12.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsIteratorMain2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); //자바1.7부터 생성자의 타입지정 생략 가능
        //타입이 유추 가능한경우 생략이 가능하다.
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100));

        System.out.println(map);    //map의 참조변수가 오게 됨.
        System.out.println(map.get("자바왕")); //Student의 참조변수 가오게 됨.
        System.out.println(map.get("자바왕").name);

    }
    private static class Student{
        String name="";
        int ban;
        int no;
        int kor;
        int math;

        public Student(String name, int ban, int no, int kor, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.math = math;
        }

    }
}
