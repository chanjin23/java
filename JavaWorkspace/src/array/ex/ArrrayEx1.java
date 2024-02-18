package array.ex;

import java.util.Scanner;

public class ArrrayEx1 {
    public static void main(String[] args) {
        int[] student =new int[5];
        Scanner scanner= new Scanner(System.in);
        int total = 0;
        for (int i = 0; i <student.length ; i++) {
            student[i]=scanner.nextInt();
            total+=student[i];
        }
        double average =(double)total/student.length;
        System.out.println("점수총합:" + total);
        System.out.println("점수평균:" + average);
    }
}
