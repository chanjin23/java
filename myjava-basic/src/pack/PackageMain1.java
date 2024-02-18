package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data =new Data();
        //같은 패키지에 있으면 그냥 클래스이름을 골라다가 사용하면 된다.
        pack.a.User user = new pack.a.User();
        //다른 패키지에 있을 때는 패키지명.클래스명 형식으로 사용하면 된다.
    }
}
