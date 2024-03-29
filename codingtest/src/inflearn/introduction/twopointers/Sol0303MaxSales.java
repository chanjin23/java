package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0303 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long max=0;
        for(int i=0;i<n-k+1;++i){
            long sum=0;
            for(int j=i;j<k+i;++j){
                sum+=arr[j];
            }
            if(max<sum) max=sum;
        }
        System.out.println(max);


    }
}
