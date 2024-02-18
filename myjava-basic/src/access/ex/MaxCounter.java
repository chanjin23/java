package access.ex;

public class MaxCounter {
    //최대값을 지정하고 최대값 까지만 증가하는 기능을 제공
    private int count=0;
    private int max;
    public MaxCounter(int max){
        this.max=max;
    }
    public void increment(){
        //검증 로직
        if(count >=max){
            System.out.println("최대 볼륨입니다");
            return;
        }
        //실행 로직
        ++count;
    }
    public int getCount(){
        return count;
    }


}
