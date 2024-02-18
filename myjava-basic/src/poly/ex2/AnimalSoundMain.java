package poly.ex2;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        animalSound(cat);
        animalSound(caw);
        animalSound(dog);
    }

    private static void animalSound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
}
