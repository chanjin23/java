
import java.util.*;
import java.io.*;
public class Main {
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; ) {
            arr[i] = sc.nextInt();
        }
    }
}