package ch13.threadstate;

public class SuspendThreadMain {
    public static void main(String[] args) {
        Runnable r = new RunImplEx10();
        Thread th1 = new Thread(r, "*");    //쓰레드의 이름 : *
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");

        th1.start();
        th2.start();
        th3.start();

        try{
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        }catch(InterruptedException e){}

    }
    private static class RunImplEx10 implements Runnable{
        @Override
        public void run() {
            while(true){
                System.out.println(Thread.currentThread().getName());   //쓰레드의 이름을 찍는다.
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
            }
        }
    }
}
