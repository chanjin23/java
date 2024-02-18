package ch13.threadstate;

public class SuspendThreadMain2 {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");    //쓰레드의 이름 : *
        MyThread th2 = new MyThread("**");      //사용자가 생성자를 직접 만들어서 내부에
        // 쓰레드를 생성하게끔 구성
        MyThread th3 = new MyThread("***");

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
    private static class MyThread implements Runnable{
        volatile boolean suspended =false;  //쉽게 바뀌는 변수
        //cpu에 있는 코어에 캐시메모리가 있는데 캐시메모리는 RAM에 있는 원본내용을 임시로 복사해서 가지고있는다.
        //근데 RAM에 있는 값이 바뀌어버리면 캐시메모리에 값은 복사된 내용이기 때문에 바뀌지 않는다.
        //volatile 키워드는 캐시메모리에잇는 변수를 사용하지 않고 원본을 그대로 가져다가 쓴다.
        volatile boolean stopped =false;
        Thread th;
        public MyThread(String name){
            th=new Thread(this, name); //Thread(Ruunable r, String name) 여기서 name은 쓰레드 이름
        }
        void start(){
            th.start();
        }
        void stop(){
            stopped =true;
        }
        void resume(){
            suspended = false;
        }
        void suspend(){
            suspended = true;
        }
        @Override
        public void run() {
            while(!stopped){
                if(!suspended){
                    System.out.println(Thread.currentThread().getName());   //쓰레드의 이름을 찍는다.
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){}
                }
            }
        }   //run
    }   //MyThread
}   //ThreadSuspendMain2
