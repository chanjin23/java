package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0209GridMaxSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] array =new int[n][n];
        for(int i=0;i<n;++i){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                array[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int max=0;
        int sum=0;
        for(int i=0;i<n;++i){
            sum =0;
            for(int j=0;j<n;++j){
                sum+=array[i][j];
            }
            if (sum > max) {
                max=sum;
            }
        }
        for(int i=0;i<n;++i){
            sum =0;
            for(int j=0;j<n;++j){
                sum+=array[j][i];
            }
            if (sum > max) {
                max=sum;
            }
        }
        sum=0;
        for(int i=0;i<n;++i){
            sum+=array[i][i];
        }
        if (sum > max) {
            max=sum;
        }
        sum=0;
        for(int i=0;i<n;++i){
            sum+=array[i][n-1-i];
        }
        if (sum > max) {
            max=sum;
        }
        System.out.println(max);

    }

}
