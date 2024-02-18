package ch12.generics;

import java.util.ArrayList;

public class GenericsWildCardMain {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();    //생성자와 데이터 타입과 지네릭이 같아야한다.

        FruitBox<? extends Fruit> appleBox = new FruitBox<Fruit>();
        //와일드카드가 쓰였으므로 Fruit밑에 자손들이 전부 들어올 수 있다.

//        appleBox = new FruitBox<Fruit>();
//        appleBox = new FruitBox<Apple>();
//        appleBox = new FruitBox<Grape>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Fruit());
//        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));

    }
    private static class Fruit{
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
    private static class Juice{
        String name;

        public Juice(String name) {
            this.name = name + "Juice";
        }
        @Override
        public String toString(){return name;}
    }

    private static class Juicer{
        static Juice makeJuice(FruitBox<? extends Fruit> box){
            String tmp = "";
            for (Fruit fruit : box.getList()) {
                tmp +=fruit +" ";
            }
            return new Juice(tmp);
        }
    }
    private static class FruitBox<T extends Fruit> extends Box<T> { }   //Box의 자식

    private static class Box<T>{    //조상
        ArrayList<T> list = new ArrayList<>();
        void add(T item){list.add(item);}   //아이템 추가
        T get(int i){return (T)/*지네릭의 장점 형변환 생략*/list.get(i);}   // item꺼낸다.
        int size(){return list.size();}
        ArrayList<T> getList(){return list;}
        @Override
        public String toString(){return list.toString();}
    }
}
