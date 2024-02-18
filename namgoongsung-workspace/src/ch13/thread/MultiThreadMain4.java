package ch13.thread;

import javax.swing.*;

public class MultiThreadMain4 {
    public static void main(String[] args) {
        //별도의 쓰레드로 입력을 받기때문에 사용자가 입력을 받지않아도 다른작업이 수행된다.
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다");
    }
}
class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i=10;i>0;--i){
            System.out.println(i);
            try{
                sleep(1000);
            }catch(Exception e) {}
        }
    }
}
