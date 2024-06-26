package inflearn.introduction.stackqueue;

import java.util.*;
public class Sol0506SavePrincess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;++i){
            queue.offer(i);
        }
        int answer=0;
        while (!queue.isEmpty()) {
            for(int i=0;i<k-1;++i) queue.offer(queue.poll());
            queue.poll();
            if(queue.size()==1) answer=queue.poll();
        }
        System.out.println(answer);



    }
}
