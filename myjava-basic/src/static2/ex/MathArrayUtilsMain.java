package static2.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
//        MathArrayUtils mathArrayUtils =new MathArrayUtils();  //클래스에서 private으로 막아놨기때문에 불가능 하다.
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum =" +MathArrayUtils.sum(values));
        System.out.println("average =" +MathArrayUtils.average(values));
        System.out.println("min =" +MathArrayUtils.min(values));
        System.out.println("max =" +MathArrayUtils.max(values));
    }
}
