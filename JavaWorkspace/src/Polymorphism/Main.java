package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("사과 : 1, 포도: 2");
        int input =scanner.nextInt();
        Fruit fruit = null;
        if(input ==1){
            fruit = new apple();
        }
        else if(input ==2){
            fruit =new grape();
        }
        else{
            System.out.println("선택사항에 없는 항목을 선택하셨습니다");
        }
        if(fruit!=null){
            fruit.show();
        }




    }
}
