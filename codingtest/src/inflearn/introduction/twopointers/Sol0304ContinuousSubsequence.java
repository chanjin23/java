package inflearn.introduction.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol0304ContinuousSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int count =0;
        for(int i=0;i<n;++i){
            int sum=0;
            int tmp=i;
            while (m > sum) {
                if(tmp>=n) break;
                sum+=arr[tmp];
                tmp++;
                if(m==sum) count++;
            }
        }
        System.out.println(count);
    }
}
