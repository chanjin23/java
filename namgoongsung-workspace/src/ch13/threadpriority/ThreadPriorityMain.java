package ch13.threadpriority;

public class ThreadPriorityMain {
    public static void main(String[] args) {
        ThreadEx6_1 th1 = new ThreadEx6_1();
        ThreadEx6_2 th2 = new ThreadEx6_2();

        //쓰레드는 기본적으로 우선순위가 5로 되어있다.
//        th1.setPriority(5); //생략 가능
        th2.setPriority(9);
        //th2의 우선순위를 높여서 ㅣ가 더 많은 작업을 수행하도록 설정
        //단 우선순위가 높다고 무조건 먼저 끝나는것은 아님 그럴확률이 조금 높다.
        //OS스케쥴러가 우선순위를 보고 파악하기 때문에 OS스케쥴러 로직에 의하여 우선순위가 높은게 더
        //많은양의 작업을 수행하게 될 확률이 높다. 이런 쓰레드의 불확실성이 어렵다


        System.out.println("Priority of th1(-) : " +th1.getPriority());
        System.out.println("Priority of th2(ㅣ) : " +th2.getPriority());
        th1.start();
        th2.start();

    }
    private static class ThreadEx6_1 extends Thread{
        @Override
        public void run(){
            for(int i=0;i<300;++i){
                System.out.print("-");
                for (int x = 0; x < 10000000; ++x) {
                }
            }
        }
    }
    private static class ThreadEx6_2 extends Thread{
        @Override
        public void run(){
            for(int i=0;i<300;++i){
                System.out.print("ㅣ");
                for (int x = 0; x < 10000000; x++) {
                }
            }
        }
    }
}
