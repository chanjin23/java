package ch12.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsIteratorMain {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 1, 1));

        Iterator<Student> iterator = list.iterator();   //지네릭 사용
        while (iterator.hasNext()) {
//            Student s =(Student) iterator.next(); //지네릭스를 사용하지 않으면 형변환 필요
//            Student s = iterator.next();
//            System.out.println(s.name);
            System.out.println(iterator.next().name);   //지네릭을 사용하면 다음과 같이 한코드에 간결하게 적어줄 수 있다.
        }

    }
    private static class Student{
        String name="";
        int ban;
        int no;

        public Student(String name, int ban, int no) {
            this.name = name;
            this.ban = ban;
            this.no = no;
        }
    }
}
