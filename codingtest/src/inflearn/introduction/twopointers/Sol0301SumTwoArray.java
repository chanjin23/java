package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0301SumTwoArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i=0;i<n;++i){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i=0;i<m;++i){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        int[] arr3=new int[n+m];
        for(int i=0;i<n+m;++i){
            if(i <n) arr3[i]=arr1[i];
            else arr3[i]=arr2[i-n];
        }
        Arrays.sort(arr3);
        for(int i:arr3){
            System.out.print(i+" ");
        }
    }
}
