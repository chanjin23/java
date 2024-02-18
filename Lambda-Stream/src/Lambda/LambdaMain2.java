package Lambda;

public class LambdaMain2 {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {  //오버라이딩 - 접근제어자는 좁게 못바꾼다.
                //만약 추상메서드의 접근자가 default 였다면 오버라이딩은  default보다 더 큰
                //public 제어자를 사용해야한다.
                return a>b? a:b;
            }
        };
        MyFunction f1 =(a,b) ->a>b?a:b;
        //람다식으로 바꾸면 다음과 같음
        //함수형 인터페이스를 바꾸기 위해서는 함수식이 같아야 함.
        //람다식은 익명 클래스이기 때문에 이름이 없다. 그래서 호출이 없다.
        //그래서 추상메서드와 익명클래스가 연결되어서 값을 호출한다.
        int value = f.max(3,5);
        //Myfunction에는 max가 있음.

        System.out.println(value);
        int value2 = f1.max(5,3);
        //클래스의 명이 없어도 잘 호출 되는 것을 확인할 수 있다.
        System.out.println(value2);
    }
}
