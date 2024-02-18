package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal =new InterfaceAnimal();
        //인터페이스 인스턴스 생성불가
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
    }
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
}
