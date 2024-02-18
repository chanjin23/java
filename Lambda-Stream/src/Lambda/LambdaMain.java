package Lambda;

public class LambdaMain {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int max =max(a,b);
        Object obj =new Object(){
            int max(int a, int b){
                return a>b ? a:b;
            }
        };
//        int value =obj.max(3,5);
        //Object클래스에는 max메서드가 없기 때문에 안됨.
        System.out.println(max);
    }
    public static int max(int a, int b){
        return a>b? a:b;
    }

}
