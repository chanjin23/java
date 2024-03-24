package inflearn.introduction;

import java.util.Scanner;

public class Sol0110ShortestStringLength {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.next();
        char one = sc.next().charAt(0);
        int[] oneCount=new int[100];
        int[] output=new int[input.length()];
        int count =0;
        for(int i=0;i<input.length();++i){
            if (input.charAt(i) == one) {
                oneCount[count]=input.length()-1;
                count++;
            }
        }
        for(int i=0;i<count;++i){
            for(int j=0;j<input.length();++j){
                output[j]=Math.abs(oneCount[i]-j);
                System.out.print(output[j]+" ");
            }
        }
    }
}
