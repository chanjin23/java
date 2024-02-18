package ch14.functioninterface;

public class FunctionInterfaceTypeMain {
    @FunctionalInterface
    private static interface MyFunction{
        void run();
    }
    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run");
            }
        };

        MyFunction f3 = getMyFunction();
        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
    private static void execute(MyFunction f){f.run();}
    //매개변수 타입에 함수형인터페이스 참조변수를 받아와서 메서드가 호출되면 해당 람다식이 바로 실행된다.
    private static MyFunction getMyFunction(){
        return () -> System.out.println("f3.fun()");    //반환타입이 Myfunction이기 때문에 람다식 사용 가능
    }
}
