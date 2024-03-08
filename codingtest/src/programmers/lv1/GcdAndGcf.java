package programmers.lv1;

import java.util.Arrays;

public class GcdAndGcf {
    static int n=3;
    static int m=12;
    public static void main(String[] args) {
        int gcd = gcd(n, m); // 최대공약수 계산
        int lcm = lcm(n, m, gcd); // 최소공배수 계산

        int[] answer = {gcd, lcm};
        System.out.println(Arrays.toString(answer));
    }

    // 최대공약수를 구하는 메서드 (유클리드 호제법 사용)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수를 구하는 메서드
    private static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
