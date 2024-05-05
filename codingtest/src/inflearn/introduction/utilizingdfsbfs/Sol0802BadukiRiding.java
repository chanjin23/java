package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0802BadukiRiding {
    static int answer,c,n;
    static int max=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i) arr[i]=sc.nextInt();

        dfs(0, 0, arr);
        System.out.println(answer);
    }

    public static void dfs(int level, int sum, int[] arr) {
        if (max < sum && sum <= c) {
            max=sum;
            answer=max;
        }
        if(level==n){
//            if (max < sum && sum <= c) {
//                max=sum;
//                answer=max;
//            }
        }else{
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum , arr);
        }
    }
}
