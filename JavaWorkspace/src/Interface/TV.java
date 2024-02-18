package Interface;

public interface TV {
    public int MIN_VOLUME =0;
    public int MAX_VOLUME =100;
    public void turnOn();
    abstract void turnOff();
    abstract void changeVolume(int volume);
    abstract void changeChannel(int channel);


}
