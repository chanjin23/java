package inflearn.introduction;

import java.util.Scanner;

public class Sol0106EliminateDuplicationString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean[] alphabet = new boolean[26];
        for(int i=0;i<input.length();++i){
            if(!alphabet[input.charAt(i)-'a']){
                sb.append(input.charAt(i));
                alphabet[input.charAt(i)-'a']=true;
            }
        }
        System.out.println(sb);
    }
}
