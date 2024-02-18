package ch9.boxing;

public class Main1 {
    public static void main(String[] args) {
//        int i = Integer.parseInt("100");
        System.out.println("i=" + Integer.parseInt("100"));
        System.out.println("i=" + Integer.parseInt("100",2));   //100을 이진수로 해석하겠다.
        System.out.println("i=" + Integer.parseInt("FF",16));
    }
}
