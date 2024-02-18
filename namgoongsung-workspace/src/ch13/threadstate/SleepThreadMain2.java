package ch13.threadstate;

public class SleepThreadMain2 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th1.start();
        th2.start();

        delay(2000);

        System.out.println("<< main 종료 >>");
    }

    private static void delay(long millis) {    //다음과 같이 delay메서드를 이용해서 하는 더 간편하게 sleep 메서드를 사용할 수 있다.
        try{
            Thread.sleep(millis); //이코드를 수행하는것은 메인쓰레드이기 때문에 main쓰레드가 잠이든다.
//            th1.sleep(2000);    //이런식으로 작성하면 th1이 잠든것처럼 보이기 때문에 이런식으로 작성하는것은 지양해야 한다.
        }catch(InterruptedException e){}
    }

    private static class ThreadEx8_1 extends Thread{
        @Override
        public void run(){
            for(int i=0;i<300;++i){
                System.out.print("-");
            }
            System.out.print("<< th1 종료 >> ");
        }
    }
    private static class ThreadEx8_2 extends Thread{
        @Override
        public void run(){
            for (int i = 0; i < 300; ++i) {
                System.out.print("ㅣ");
            }
            System.out.print("<< th2 종료 >>");
        }
    }
}
