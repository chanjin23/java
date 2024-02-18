package Lambda;

public class LambdaMain6 {
    public static void main(String[] args) {
        MyFunction4 f=(a,b) -> {
            a=20;
            b=20;
            return a+b;
        };
        int value=f.example(1,2);
        System.out.println(value);
    }
}
