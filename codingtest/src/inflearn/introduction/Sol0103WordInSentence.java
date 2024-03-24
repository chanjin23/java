package inflearn.introduction;

import java.util.Scanner;

public class Sol0103WordInSentence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        String[] split =input.split(" ");
        int max=-1;
        String output = "";
        for(String s:split){
            if (max < s.length()) {
                max=s.length();
                output=s;
            }
        }
        System.out.println(output);
    }
}
