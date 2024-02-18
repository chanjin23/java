package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a, int b) {
//        super(); //생략 가능
        System.out.println("ClassB 생성자 a = " + a +"ClassB 생성자 b = " + b);
    //        super();//super는 가장 위에 생성되야함.
    }

    public ClassB(int a) {
//        super();    //기본 생성자 생략 가능
        this(a,0);
        System.out.println("ClassB 생성자 a=" + a);
    }
}
