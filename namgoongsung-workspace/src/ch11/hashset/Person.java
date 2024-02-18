package ch11.hashset;

import java.util.Objects;

public class Person /*extends Object*/{     //모든 클래스의 조상인 Object가 원래는 항상 상속받고있기때문에 extends를  해야하지만
    //보통은 그냥쓰지??
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;

        Person tmp = (Person) obj;
        return name.equals(tmp.name) &&age==tmp.age;
    }

    @Override
    public int hashCode(){
        //int hash(Object... values); -> 가변인자를 여러개넣어도됨.
        return Objects.hash(name, age);
    }

    @Override
    public String toString(){
        return name +":"+age;
    }
}
