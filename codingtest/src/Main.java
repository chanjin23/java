import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        String answer="";
        String[] arr=new String[str.length()/7];

        for(int i=0;i<arr.length;++i){
            arr[i]=str.substring(0,7);
            str=str.substring(7,str.length());
        }//for

        for(int i=0;i<arr.length;++i){
            arr[i]=arr[i].replace("#","1");
            arr[i]=arr[i].replace("*","0");
            char tmp=(char)Integer.parseInt(arr[i],2);
            answer+=tmp;
        }//for
        System.out.println(answer);
    }
}