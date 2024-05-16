package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0809FindCombination {
    //1부터 n까지 번호가 적힌 구슬이 있다. 이중 m개를 뽑느 방법의 수를 출력하는 프로그램을 작성하라
    static int n,m;
    static int[] answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        dfs(0,1);
    }

    public static void dfs(int level,int sum) {
        if (level == m) {
            for(int i:answer) System.out.print(i+" ");
            System.out.println();
        }else{
            for (int i=sum; i <= n; ++i) {
                answer[level] = i;
                dfs(level + 1,i+1);
            }
        }
    }
}
