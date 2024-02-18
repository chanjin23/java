package ch13.daemonthread;

public class DaemonThreadMain implements Runnable{
    static boolean autoSave =false;
    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadMain());  // Thread(Runnable r)

        t.setDaemon(true);  //메인쓰레드를 데몬쓰레드로 변경, 이부분이 없으면 무한루프에 돌면서 프로그램이 종료되지 않는다.
        t.start();

        for(int i=1;i<=10;++i){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
            System.out.println(i);

            if(i==5) autoSave=true;
        }

        System.out.println("프로그램을 종료합니다");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3 * 1000); //3초마다
            }catch(InterruptedException e){}
            
            if(autoSave) autoSave();
        }
    }

    private void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다");
    }
}
