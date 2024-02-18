package Interface;

public interface Calculator {
    public int plus(int a,int b);
    public int minus(int a, int b);
    default int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }

}
