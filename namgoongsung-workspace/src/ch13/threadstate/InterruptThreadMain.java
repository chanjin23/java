package ch13.threadstate;

import javax.swing.*;

public class InterruptThreadMain {
    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        System.out.println("isInterrupted(): " + th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다");
        th1.interrupt();    //interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted(): " + th1.isInterrupted());
        System.out.println("isInterrupted(): " + th1.isInterrupted());
        System.out.println("interrupted(): " + Thread.interrupted());   //interrupted는 static메서드 즉
        // 자기자신의 쓰레드이기 때문에 main메서드가 호출된다 그래서 반환 값이 false가 나온다.
    }
    private static class ThreadEx9_1 extends Thread{
        @Override
        public void run(){
            int i=10;

            while (i != 0 && !this.isInterrupted()) {   //i가 0이 되거나 interrupted가 true가 되면 반복문 탈출
                System.out.println(i--);
                for(long x=0;x<2500000000L;x++);    //시간 지연
            }
            System.out.println("ThreadEx9_1 interrupted() : " + Thread.interrupted());
            System.out.println("ThreadEx9_1 interrupted() : " + Thread.interrupted());
            // isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 초기화 하기때문에 2번째에서는
            // 반환 값이 false가 나온다.
            System.out.println("카운트가 종료되었습니다");
        }
    }
}
