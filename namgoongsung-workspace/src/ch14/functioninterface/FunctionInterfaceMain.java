package ch14.functioninterface;

public class FunctionInterfaceMain {
    public static void main(String[] args) {
        MyFunction f2 = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };  // 원래는 함수형 인터페이스를 작성할 때 다음과 같이 작성해야한다.

        MyFunction f = (a, b) -> a > b ? a : b; //람다식을 통해서 코드가 간결해진다.
        //람다식은 매개변수 타입과 결과타입이 같아야 연결이 되기 때문에 함수형인터페이스의 반환타입과 매개변수를 맞춰줘야 한다.
        int value = f.max(3, 5);
        System.out.println("value =" + value);

    }
    //인터페이스는 기본적으로 메서드에 public abstract가 생략되어 있다.
    @FunctionalInterface    //함수형 인터페이스는 단 하나의 추상메서드만 가져야만 한다.
    private static interface MyFunction{
        /*public abstract */int max(int a, int b);
    }
}
