package inflearn.introduction.twopointers;

import java.util.Scanner;

public class Sol0305SumContinuousNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int answer =0;
        for(int i=1;i<=n/2;++i){
            sum=0;
            int tmp=i;
            while(sum <n){
                sum+=tmp;
                if(sum==n) answer++;
                tmp++;
            }
        }
        System.out.println(answer);
    }
}
