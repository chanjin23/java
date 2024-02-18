package ch14.optional;

import java.util.Optional;

public class OptioinalMain {
    public static void main(String[] args) {
        //null이 나오는 프로그램은 좋지 않은 프로그램
//        int[] arr=null; // 바람직한지 않은 코드 nullPointerException 발생
        int[] arr =new int[0];  // 초기화를 다음과 같이 하여 null이 나오지 않게 끔한다.
        System.out.println("arr.length:" +arr.length);

//        Optional<String> opt =null; // 바람직하지 않은코드
        Optional<String> opt = Optional.empty();
        System.out.println("opt =" +opt);
        System.out.println("opt =" +opt.orElse("x"));
//        System.out.println(opt.get());  //get으로 값을 가져오면 NoSuchElementException일 발생한다.
        //그래서 try-catch문을 이용해서 null을 제어해야 한다.

        String str ="";
//        try{
//            str=opt.get();
//        }catch(Exception e){
//            str ="";    //예외가 발생하면 빈문자열("")로 초기화
//        }
//        System.out.println(str);  //다음과 같이 초기화 해준다.

        str = opt.orElse("EMPTY");  //get대신에 orElse를 이용하여 처리한다
        //만약 값이 null이 들어있으면 안에 들어있는 값(EMPTY)으로 반환한다.
        System.out.println("str=" + str);
        str = opt.orElseGet(() -> new String("아무것도없음"));
        // 다음과 같이 orElseGet으로 람다식을 사용하는 방법도있다. Supplier
        System.out.println("str=" + str);




    }
}
