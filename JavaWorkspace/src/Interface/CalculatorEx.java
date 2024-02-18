package Interface;

public class CalculatorEx {
    public static void main(String[] args) {

        Calculator cal =new MyCal();
        int a=cal.plus(1,3);
        int b=cal.minus(3,1);
        int c=cal.multiply(3,5);
        int d=Calculator.divide(9,3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
