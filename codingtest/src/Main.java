
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        String s = "01110";
        System.out.println(Arrays.toString(T.solution(s)));
    }
    public int[] solution(String s) {
        int remove=0;
        int answer=0;
        while(!s.equals("1")){
            int len=s.length();
            int count=0;
            for(int i=0;i<len;++i){
                char ch=s.charAt(i);
                if(ch=='1') count++;
                else remove++;
            }
            answer++;
        }
        return new int[]{answer,remove};
    }
}