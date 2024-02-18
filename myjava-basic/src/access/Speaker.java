package access;

public class Speaker {
    private int volume;
    //private 키워드가 붙으면 해당 클래스를 제외한 모든 클래스에 접근을 할 수 없다.

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다");

        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

        void volumeDown() {
            volume -= 10;
            System.out.println("음량을 10 감소합니다");
        }

        void showVolume(){
            System.out.println("현재 음량: "+ volume);
        }



}
