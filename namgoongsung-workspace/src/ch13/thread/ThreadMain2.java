package ch13.thread;

public class ThreadMain2 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx2_1();
        Thread t2 = new Thread(r);  //생성자Thread(Runnable target)

        t1.start();
        t2.start();
        //멀티쓰레드를 사용하면 멀티 작업이 수행되기때문에 실행결과 0과 1이 번갈아가면서 실행된다.
    }
}

//Thread를 구현할 수 있는 방법 2가지
class ThreadEx1_1 extends Thread{ //Thread클래스를 상속해서 쓰레드를 구현
    public void run(){  //쓰레드가 수행할 작업을 작성
        for (int i = 0; i < 100; ++i) {
            System.out.println(1);  //조상인 Thread의 getName()을 호출
        }
    }
}
class ThreadEx2_1 implements Runnable{    //Runnable 인터페이스를 구현해서 쓰레드를 구현
    @Override
    public void run() { //쓰레드가 수행할 작업을 작성
        for (int i = 0; i < 100; ++i) {
            System.out.println(0);
        }
    }
}
