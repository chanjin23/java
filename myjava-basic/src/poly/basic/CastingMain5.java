package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 =new Parent();
        System.out.println("parent1 호출 ");
        call(parent1);

        Parent parent2 =new Child();
        System.out.println("parent2 호출 ");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child/*child이런식으로 instanceof
            선언과 동시에 객체를 생성할 수 있음.*/  ){
//            Parent p =new Child(); //이말이랑 똑같은 뜻임.
            System.out.println("Child 인스턴스 맞음");
            Child child =(Child) parent;
            child.childMethod();
        }
    }
}
