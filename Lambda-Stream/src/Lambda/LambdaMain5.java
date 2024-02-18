package Lambda;

public class LambdaMain5 {
    public static void main(String[] args) {
        MyFunction3 f= new MyFunction3() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        MyFunction3 f1 =(a,b)-> a>b?a:b;
        int value2 = f1.max(10, 56);
        int value = f.max(3,5);
        System.out.println(value);
        System.out.println(value2);

    }

}
