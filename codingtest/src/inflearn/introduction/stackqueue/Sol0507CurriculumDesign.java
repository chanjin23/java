package inflearn.introduction.stackqueue;

import java.util.*;
public class Sol0507CurriculumDesign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Queue<Character> queue1=new LinkedList<>();
        Queue<Character> queue2=new LinkedList<>();

        for(int i=0;i<str2.length();++i){
           char ch =str2.charAt(i);
           queue1.offer(ch);
        }
        for(char ch:str1.toCharArray()){
            queue2.offer(ch);
        }
        for(int i=0;i<str2.length();++i){
            if(queue1.poll()==queue2.peek()){
                queue2.poll();
            }
        }
        if(queue2.size()==0) System.out.println("YES");
        else System.out.println("NO");

    }
}
