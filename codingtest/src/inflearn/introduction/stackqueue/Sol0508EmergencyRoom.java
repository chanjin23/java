package inflearn.introduction.stackqueue;

import java.util.*;
import java.io.*;

public class Sol0508EmergencyRoom {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int i=0;
        while(true){
            int first=arr[i];



        }
    }
}
