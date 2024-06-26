package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0602BubbleSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=n-1;i>0;--i){
            for(int j=0;j<i;++j){
                if(arr[j] >arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }

    }
}
