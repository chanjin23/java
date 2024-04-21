package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0708FindCalf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int jump=0;
        if(s >e){
            System.out.println(s-e);
            return;
        }
        while(s!=e){
            if(e-s>=5){
                jump+=(e-s)/5;
                s+=((e-s)/5)*5;
            }else if(e-s==4){
                jump+=2;
                break;
            }else{
                s+=1;
                jump++;
            }
        }
        System.out.println(jump);
    }
}
