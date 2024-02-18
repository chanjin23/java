package ch13.thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();

        //인터페이스로 구현을 했기 때문에 외부로 부터 객체를 받아와서 Thread에 값을 받아와야 한다.
        Runnable r = new ThreadEx2();
        Thread t2 = new Thread(r);  //생성자Thread(Runnable target)

        t1.start();
        t2.start();
    }
}

//Thread를 구현할 수 있는 방법 2가지
class ThreadEx1 extends Thread{ //Thread클래스를 상속해서 쓰레드를 구현
    @Override
    public void run(){  //쓰레드가 수행할 작업을 작성
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; ++i) {
            System.out.println(this.getName());  //조상인 Thread의 getName()을 호출
        }
        System.out.println("ThreadEx1 소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}
class ThreadEx2 implements Runnable{    //Runnable 인터페이스를 구현해서 쓰레드를 구현
    @Override
    public void run() { //쓰레드가 수행할 작업을 작성
        double startTime = System.currentTimeMillis();
        for (int i = 0; i <10; ++i) {
            //Thread를 상속받지 않았기때문에 직접 접근해서 getName()을 반환한다.
            //Thread. currentThread() - 현재 실행중인Thread를 반환한다.
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("ThreadEx2 소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}
