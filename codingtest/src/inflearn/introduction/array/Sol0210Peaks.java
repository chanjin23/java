package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0210Peaks {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] array=new int[n+2][n+2];
        int len =array.length;
        for(int i=1;i<=len-2;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=len-2;j++){
                array[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        int count =0;
        for(int i=1;i<=len-2;++i){
            for(int j=1;j<=len-2;j++){
                int tmp =array[i][j];
                if(tmp>array[i][j+1]&&tmp>array[i][j-1]&&tmp>array[i+1][j]&&tmp>array[i-1][j]) count++;
            }
        }
        System.out.println(count);
    }
}
