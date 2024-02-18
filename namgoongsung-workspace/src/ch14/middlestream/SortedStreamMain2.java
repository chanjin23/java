package ch14.middlestream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedStreamMain2 {
    public static void main(String[] args) {
        //객체 배열로 부터 스트림을 생성할 때는 Stream.of를 사용하면된다.
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("자자바", 2, 100),
                new Student("감자바", 1, 180)
        );
        studentStream.sorted(Comparator.comparing((Student s) -> s.getBan())
                        .thenComparing(Comparator.naturalOrder()))  //기본정렬
                .forEach(System.out::println);
    }
    private static class Student implements Comparable<Student>{
        String name;
        int ban;
        int totalScore;

        public Student(String name, int ban, int totalScore) {
            this.name = name;
            this.ban = ban;
            this.totalScore = totalScore;
        }
        public String getName(){ return name;}
        public int getBan() {return ban;}
        public int getTotalScore(){return totalScore;}

        @Override
        public String toString(){
            return name + ", " + ban + ", " + totalScore;
        }

        //큰게 맨 왼쪽으로 -> 내림차순
        //기본 정렬
        @Override
        public int compareTo(Student o/*왼쪽*/) {
            return o.totalScore - this.totalScore/*오른쪽 본인*/;
        }
    }
}
