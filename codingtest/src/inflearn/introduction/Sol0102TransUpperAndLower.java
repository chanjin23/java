package inflearn.introduction;

import java.util.*;
public class Sol0102TransUpperAndLower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        StringBuilder sb=new StringBuilder();
//        System.out.println((int)'a' + " "+(int)'A');
        for (int i = 0; i < input.length(); ++i) {
            if(input.charAt(i)>='a'){
                //소문자인경우
                sb.append(input.substring(i,i+1).toUpperCase());
            }else{
                sb.append(input.substring(i,i+1).toLowerCase());
            }
        }
        System.out.println(sb);
    }

}
