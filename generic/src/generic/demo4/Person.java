package generic.demo4;

class Person<T,S> {
    public T info;
    public S id;
    Person(T info, S id){
        this.info =info;
        this.id =id;
    }
    public <U> void printInfo(U Info){
        System.out.println(Info);
    }
    //메서드 내에서만 제너릭을 지정하는 경우 다음과 같이 할 수 있다.
}
