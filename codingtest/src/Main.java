import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        int lt=0;
        int rt=0;
        int count=0;
        int answer=0;
        while(true){
            if(arr[rt]==0) count++;
            while(count>k){
                if(arr[lt]==0) count--;
                lt++;
            }
            int len=rt-lt+1;
            answer=Math.max(len,answer);
            rt++;
            if(arr.length <=rt) break;
        }
        System.out.println(answer);
    }
}