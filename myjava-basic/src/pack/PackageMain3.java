package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA =new User();
        User userA1 =new User();
        User userA2 =new User();
        User userA3 =new User();
        pack.b.User userB =new pack.b.User();
        //만약 다른패키지에 있는 같은 이름의 클래스들을 사용하고 싶으면 다음과 같이 해야한다.
        //결국은 인스턴스를 생성하는 것은 해당 패키지의 경로에 있는 클래스들로 결정나는 것이기 때문에
        //경로가 중요하다.
    }
}
