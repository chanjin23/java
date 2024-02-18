package generic.demo4;


public class GenericDemoMain {
    public static void main(String[] args) {
        EmployInfo e= new EmployInfo(1);
        //해당 변수를 지정한 후에 값을 넣으면
        Person p1 = new Person(e, 1);
        //값을 지정해주지 않아도 생략이 가능하다.
        p1.<EmployInfo>printInfo(e.rank);
        //제너릭 메소드를 사용할 때는 다음과같이 사용할 수있고 해당 변수를 지정하면 다음과 같이 생략할 수 있다.
        p1.printInfo(e.rank);
//        System.out.println(p1.info.rank);
    }
}
