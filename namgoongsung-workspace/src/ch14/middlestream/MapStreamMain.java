package ch14.middlestream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class MapStreamMain {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1.txt"),
                new File("Ex1")
        };

//        Stream<File> fileStream = Stream.of(fileArr);
        Stream<File> fileStream = Arrays.stream(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);  //파일의 이름을 String스트림으로 전환
        filenameStream.forEach(System.out::println);
        System.out.println("------------------------");

        fileStream = Stream.of(fileArr);    //스트림 재생성
        fileStream.map(File::getName)   //File이름을 String스트림으로 전환
                .filter(s -> s.indexOf('.') != -1)  //.이 없는 건 제외
                .map(s -> s.substring(s.indexOf('.') + 1))  //. 뒤에있는 값들만 추출
                .map(String::toUpperCase)   //대문자 변경
                .distinct() //중복 제거
                .forEach(i -> System.out.print(i + " "));   //출력
    }
}
