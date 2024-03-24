package inflearn.introduction;

import java.util.Scanner;

public class Sol0107PalindromeString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine().toUpperCase();
        boolean flag =true;
        for(int i=0;i<input.length()/2;++i){
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
