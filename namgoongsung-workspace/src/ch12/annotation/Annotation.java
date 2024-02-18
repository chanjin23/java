package ch12.annotation;

class Parent{
    void parentMethod() {}
}
class Child extends Parent{
    @Override
    @Deprecated //이거 쓰지마라고 얘기하는것
    void parentMethod(){}
}
@FunctionalInterface    //함수형 인터페이스는 하나의 추상메서드만 가능하다. 근데 두개가 생겨서 에러가 생긴다.
interface  Testable{
//    void test();  //추상메서드
    void check();   //추상메서드
}
public class Annotation {
    @SuppressWarnings("deprecation")    //내가 deprecation에 경고를 알고 있으니까 경고 메세지를 안띄어도돼 라고 하는것
    //경고창이 사라지는 것을 볼 수 있음
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();   //deprecated된 메서드 사용
    }
}
