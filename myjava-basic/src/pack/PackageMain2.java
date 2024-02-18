package pack;

import pack.a.User;
//import를 하면 패키지의 확장명을 생략할 수 있다.

import pack.a.*;
//* 을 붙이면 pack.a의 패키지의 모든 클래스들을 사용할 수 있다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data =new Data();
        //같은 패키지에 있으면 그냥 클래스이름을 골라다가 사용하면 된다.
        User user = new User();
        User2 user2 =new User2();
    }
}
