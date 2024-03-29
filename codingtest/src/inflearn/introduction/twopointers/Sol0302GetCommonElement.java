package inflearn.introduction.twopointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Sol0302GetCommonElement {
    public static void main(String[] args) throws Exception{
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
        int tmp=0;
        int count =0;
        int[] arr3 = new int[30001];
        for(int i=0;i<n;++i){
            tmp =arr1[i];
            for(int j=0;j<m;++j){
                if(tmp==arr2[j]){
                    arr3[count]=tmp;
                    count++;
                }
            }
        }
        Arrays.sort(arr3);
    }
}
