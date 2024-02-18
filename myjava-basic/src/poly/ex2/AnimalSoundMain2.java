package poly.ex2;


public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료\n");
        }
    }
}
