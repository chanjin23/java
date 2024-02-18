package cond;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double rating =scanner.nextDouble();
        String movie="영화";
        System.out.println("rating : "+ rating);
        System.out.println("출력:");
        if(rating <= 9){
            movie ="어바웃타임";
            System.out.println(movie+"을 추천합니다");
        }
        if(rating <=8){
            movie = "토이 스토리";
            System.out.println(movie+"을 추천합니다");
        }
        if(rating <=7){
            movie ="고질라";
            System.out.println(movie+"을 추천합니다");
        }


    }
}
