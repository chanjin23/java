package ch14.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceMain2 {
    public static void main(String[] args) {
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;
        System.out.println();

//        Function<Integer, MyClass> f = (i) -> new MyClass(i);
        Function<Integer, MyClass> f = MyClass::new;
        MyClass mc = f.apply(3);    //생성자
        System.out.println(mc); //MyClass 객체 생성의 참조변수
        System.out.println(mc.value);
        System.out.println(f.apply(3).value);

//        Function<Integer, int[]> f2 = (i) -> new int[i];    //배열길이를 정하는 함수형 인터페이스
        Function<Integer, int[]> f2 =int[]::new;    //메서드 참조를 이용하여 다음과 같이 생략 할 수 있다.
        int[] arr = f2.apply(100);
        System.out.println(arr.length);

    }

    private static class MyClass {
        int value;
        MyClass(int value){
            this.value =value;
        }

    }

}
