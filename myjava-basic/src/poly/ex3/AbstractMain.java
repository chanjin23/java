package poly.ex3;


import poly.overriding.Parent;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractAnimal animal =new AbstractAnimal();
        //추상클래스이므로 컴파일 오류가 발생함.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();
        System.out.println();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
}
