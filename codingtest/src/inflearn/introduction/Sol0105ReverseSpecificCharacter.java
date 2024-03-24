package inflearn.introduction;

import java.util.Scanner;

public class Sol0105ReverseSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder output =new StringBuilder();
        for(int i=0;i<input.length();++i){
            if(input.charAt(i)>='A'&&input.charAt(i)<='Z'||input.charAt(i)>='a'&&input.charAt(i)<='z'){
                output.append(input.substring(input.length() - i - 1, input.length() - i));
            }else{
                output.append(input.substring(i, i + 1));
            }

        }
        System.out.println(output);

    }
}
