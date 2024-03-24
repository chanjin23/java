package inflearn.introduction;

import java.util.Scanner;

public class Sol0111CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        char tmp=input.charAt(0);
        String output = String.valueOf(input.charAt(0));
        int count =1;
        for(int i=1;i<input.length();++i){
            if(input.charAt(i)==tmp){
                ++count;
            }else{
                if(count==1){
                    output+=input.substring(i,i+1);
                }
                output+=count;
                count=1;
            }
        }
        System.out.println(output);
    }
}
