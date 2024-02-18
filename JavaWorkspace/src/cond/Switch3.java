package cond;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int grade=scanner.nextInt();

        int coupon;
        switch(grade){
            case 1:
                coupon =1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon =500;
                break;
        }
        System.out.println("발급받은 쿠폰: " + coupon);
    }
}
