package Interface;

public class LedEx {
    public static void main(String[] args) {
        TV tv=new LedTV();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel(100);
        tv.changeVolume(290);
    }
}
