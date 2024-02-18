package ch9.string;

public class StringMain {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal= 200.0;
        String strVal2 = String.valueOf(dVal);

        double sum = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(String.join("", strVal+ "+"+ strVal2+ "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum);
    }
}
