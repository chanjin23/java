package generic.demo3;

class Person<T,S> {
    public T info;
    public S id;
    Person(T info,S id){
        this.info =info;
        this.id =id;
    }
}
