package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass =new PublicClass();
        DefaultClass1 class1 =new DefaultClass1();
        DefaultClass2 class2 =new DefaultClass2();
    }

}
//하나의 파일에서는 여러 개의 클래스파일을 만들 수 있다.
//단, public class는 하나만 만들 수 있고,
//default class는 무한 정 만들어도 된다.
class DefaultClass1{

}
class DefaultClass2{

}
