
import java.util.*;
import java.io.*;
public class Main {
    static int c,answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        answer=0;
        dfs(0, 0,arr);
        System.out.println(answer);
    }

    public static void dfs(int level, int sum,int[] arr) {
        if(c <sum) return;
        if(level==arr.length){
            if (c >= sum) {
                answer = Math.max(answer, sum);
            }
        }else{
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }
}