package ch13.thread;

import javax.swing.*;

public class SingleThreadMain4 {
    public static void main(String[] args) throws Exception{
        //싱글쓰레드로 작성한 작업
        // 사용자가 값을 입력하지 않으면 뒤에있는 코드들은 수행되지 않는다.
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다");

        for (int i = 10; i > 0; --i) {
            System.out.println(i);
            try{
                Thread.sleep(1000); //1초간 시간을 지연한다.
            }catch(Exception e){}
        }
    }

}
