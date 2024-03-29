package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0211TemporaryLeader {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] array = new int[n][n];
        for(int i=1;i<n;++i){
            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                array[i][j] = Integer.parseInt(br.readLine());
            }
        }
        //중복을 먼저 찾고
        //
        int[] count =new int[n];
        for(int i=0;i<n;++i){
            boolean[] classN =new boolean[10];   //1~9
            for(int k=0;k<n;++k){
                if(classN[array[k][i]]){
                    //중복된 경우
                    count[k]++;
                }
            }
            for(int j=0;j<n;++j){

                if(classN[array[j][i]]){
                    //중복된 경우
                    count[j]++;
                }
                classN[array[j][i]]=true;
            }
        }
    }
}
