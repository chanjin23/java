package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClassInnerMain publicCLass=new PublicClassInnerMain();
        DefaultClass1 class1 =new DefaultClass1();
        DefaultClass2 class2 =new DefaultClass2();
        //같은 패키지의 클래스이기 때문에 다른클래스에서도 접근이 가능하다.
    }
}
