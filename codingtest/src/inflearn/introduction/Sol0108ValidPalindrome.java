package inflearn.introduction;

import java.util.Scanner;

public class Sol0108ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine().toLowerCase();
        boolean flag=true;
        for(int i=0;i<input.length()/2;++i){
            if(input.charAt(i)>='a'&&input.charAt(i)<='z'||input.charAt(i)>='Z')
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                flag=false;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
