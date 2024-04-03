package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0306MaxLengthOfConsecutiveParts {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<n;++i){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int[] arr=new int[n];
        int tmp=0;
        int max =-1;
        for(int i=0;i<n;++i){
            for(int h=0;h<n;++h){
                arr[h] = list.get(h);
            }
            tmp =k;
            int count =0;
            for(int j=i;j<n;++j){
                if(arr[j]==0) {
                    arr[j]=1;
                    tmp--;
                }
                if(tmp<=0) break;
            }
            int tmpMax=0;
            for(int s=0;s<n;++s){
                if(arr[s]==1){
                    ++count;
                }else if(arr[s]==0) count=0;
                if(tmpMax<count) tmpMax=count;
            }
            max=Math.max(tmpMax,max);
        }

        System.out.println(max);
    }
}
