<<<<<<< HEAD:codingtest/src/programmers/lv1/RectangleStar.java
package programmers.lv1;
=======
package lv1;
>>>>>>> ea6cb7a610b9227e595fee5cdbed64a2f58ca143:codingtest/src/lv1/RectangleStar.java

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //2중for문이용
        for(int i=0;i<b;++i){
            for(int j=0;j<a;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
