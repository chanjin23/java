package inflearn.introduction;

import java.util.Scanner;

public class Sol0109ExtractNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            if(input.charAt(i)<'a'||input.charAt(i)>'z'){
                sb.append(input.charAt(i));
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
