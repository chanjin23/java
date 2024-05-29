
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(T.solution(want, number, discount));
    }
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String,Integer> need=new HashMap<>();
        int answer=0;
        for(int i=0;i<want.length;++i) need.put(want[i],number[i]);
        for(int i=0;i<discount.length-10+1;++i){
            HashMap<String,Integer> compare=new HashMap<>();

            for(int j=i;j<10+i;++j){
                compare.put(discount[j],compare.getOrDefault(discount[j],0)+1);
            }
            boolean flag=false;
            for(String str:need.keySet()){
                if(compare.containsKey(str)){
                    if(need.get(str)>compare.get(str)){
                        flag=true;
                        break;
                    }
                }else{
                    flag=true;
                    break;
                }
            }// for-each
            if(!flag){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}