package inflearn.introduction;

import java.util.*;
import java.io.*;
public class Sol0104ReverseWord {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        for(int i=0;i<n;++i){
            StringBuilder sb=new StringBuilder();
            sb.append(br.readLine()).reverse();
            System.out.println(sb);
        }
    }
}
