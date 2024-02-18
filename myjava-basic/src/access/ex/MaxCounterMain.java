package access.ex;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter= new MaxCounter(30);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        System.out.println(maxCounter.getCount());

    }
}
