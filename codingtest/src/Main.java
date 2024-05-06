import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int answer=0;
        for (int i = 0; i < str1.length() - str2.length() + 1; ++i) {
            int len=str2.length();
            String tmp = str1.substring(i, i + len);
            boolean flag=true;
            for (char c : tmp.toCharArray()) {
                if (!map.containsKey(c)){
                    flag=false;
                    break;
                }
                map.put(c, map.get(c) - 1);
                if(map.get(c)!=0){
                    flag=false;
                    break;
                }
            }
            if(flag) answer++;
            for (char c : str2.toCharArray()) {
                map.put(c, 1);
            }
        }
        System.out.println(answer);
        System.out.println(answer);
    }
}