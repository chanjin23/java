
import java.util.*;

public class Main {
    //1부터 n까지 번호가 적힌 구슬이 있다. 이중 m개를 뽑느 방법의 수를 출력하는 프로그램을 작성하라
    static int n,m,count=0;
    static int[] arr,answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        answer = new int[m];
        for (int i = 0; i < n; ++i) arr[i] = i + 1;

        dfs(0, 0);
        System.out.println(count);
    }

    public static void dfs(int level, int idx) {
        if(level==m) {
            for(int i:answer) System.out.print(i + " ");
            System.out.println();
            ++count;
        }else{
            for (int i = idx; i < n; ++i) {
                answer[level]=arr[i];
                dfs(level + 1, i + 1);
            }
        }
    }
}