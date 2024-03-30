package inflearn.introduction.twopointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Sol0302GetCommonElement {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<n;++i){
            set1.add(Integer.parseInt(st.nextToken()));
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<m;++i){
            set2.add(Integer.parseInt(st.nextToken()));
        }
        set1.retainAll(set2);
        ArrayList<Integer> list =new ArrayList<>(set1);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i+" ");
        }


    }
}
