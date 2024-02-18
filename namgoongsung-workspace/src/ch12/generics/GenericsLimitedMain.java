package ch12.generics;

import java.util.ArrayList;

public class GenericsLimitedMain {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();    //항상 같은 타입의 지네릭이 들어와야하기때문에 생략 가능
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//        FruitBox<Toy> toyBox = new FruitBox<>();  //extends로 제한을 걸어서 에러
        Box<Toy> toyBox = new Box<>();  //Box에서는 가능 extends로 제한을 걸지 않았기 때문에

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());  //다형성에 의해 Apple 가능
        fruitBox.add(new Fruit());  //다형성 에의해 Fruit 가능
        appleBox.add(new Apple());
//        appleBox.add(new Grape());    //Grape는 Apple의 자손이 아니므로 에러
        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);

    }
    private static interface Eatable{}
    private static class Fruit implements Eatable{
        @Override
        public String toString(){return "Fruit";}
    }
    private static class Apple extends Fruit{
        @Override
        public String toString(){return "Apple";}
    }
    private static class Grape extends Fruit{
        @Override
        public String toString(){return "Grape";}
    }
    private static class Toy{}

    private static class FruitBox<T extends Fruit & Eatable> extends Box<T> { } //클래스와 인터페이스를 같이 쓸때는 &를 써줘야한다.

    private static class Box<T>{
        ArrayList<T> list = new ArrayList<>();
        void add(T item){list.add(item);}   //아이템 추가
        T get(int i){return list.get(i);}   // item꺼낸다.
        int size(){return list.size();}
        @Override
        public String toString(){return list.toString();}
    }
}
