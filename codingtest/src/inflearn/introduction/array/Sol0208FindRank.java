package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0208FindRank {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] array=new int[n];
        int[] tmp=new int[n];
        for(int i=0;i<n;++i){
            array[i] =Integer.parseInt(st.nextToken());
            tmp[i] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
    }
}
