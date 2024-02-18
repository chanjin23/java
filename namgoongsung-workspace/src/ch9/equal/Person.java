package ch9.equal;

public class Person {
    long id;

    public Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;
        return id==((Person)obj).id;
    }
}
