import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        for(int i=0;i<n;++i){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<5;++j){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //로직
        int[] count = new int[n];
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<n;++i){
            for(int j=0;j<5;++j){
                if(list.isEmpty()) list.add(arr[i][j]);
                if (list.contains(arr[i][j])) {
                    count[i]++;
                }
            }
        }
    }
}