package inflearn.introduction;


import java.util.Scanner;

public class Sol0101FindString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        String strOne =sc.nextLine().toUpperCase();
        int count =0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==strOne.charAt(0)){
                ++count;
            }
        }
        System.out.println(count);

    }
}
