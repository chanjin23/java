package inflearn.introduction.array;

import java.util.Scanner;

public class Sol0205PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        for(int i=2;i<=n;++i){
            boolean flag =true;
            for(int j=2;j<=i/2;++j){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag) ++count;
        }
        System.out.println(count);
    }
}
