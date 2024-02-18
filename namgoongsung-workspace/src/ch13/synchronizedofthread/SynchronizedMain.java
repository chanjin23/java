package ch13.synchronizedofthread;

public class SynchronizedMain {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();
        new Thread(r).start();

    }
    private static class Account{
        private int balance =1000;

        public synchronized int getBalance() {
            return balance;
        }

        public synchronized void withdraw(int money) {
            if (balance >= money) {
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
                balance -= money;
            }
        }   //withdraw
    }
    private static class RunnableEx12 implements Runnable{
        Account acc = new Account();
        @Override
        public void run() {
            while (acc.getBalance() > 0) {
                //100,200,300중의 한 값을 임의로 선택해서 출금
                int money = (int) (Math.random() * 3 + 1) * 100;
                acc.withdraw(money);
                System.out.println("현재 잔고: " + acc.getBalance());
            }
        }
    }
}
