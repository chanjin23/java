package ch13.threadstate;

public class JoinThreadMain {
    static long startTime =0L;
    public static void main(String[] args) {
        ThreadEx11_1 th1 = new ThreadEx11_1();
        ThreadEx11_2 th2 = new ThreadEx11_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try{
            th1.join(); //main쓰레드가 th1쓰레드이 끝날때까지 기다린다.
            th2.join();
        }catch (InterruptedException e){}
        //join메서드가 없으면 th1, th2가 종료되기전에 먼저 메인쓰레드가 종료되어 버린다.

        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
    private static class ThreadEx11_1 extends Thread{
        @Override
        public void run(){
            for (int i = 0; i < 300; ++i) {
                System.out.print("-");
            }
        }
    }

    private static class ThreadEx11_2 extends Thread {
        @Override
        public void run(){
            for (int i = 0; i < 300; ++i) {
                System.out.print("ㅣ");
            }
        }
    }
}
