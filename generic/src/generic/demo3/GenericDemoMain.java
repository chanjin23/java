package generic.demo3;

public class GenericDemoMain {
    public static void main(String[] args) {
//        Person<EmployInfo,int> p1 =new Person<EmployInfo, int>(new EmployInfo(1),1);
        //generic은 일반 변수가 아닌 참조변수 즉, 레퍼런스타입만 올수있다. int, double, char는 들어갈 수없다.
        //그러면 기본형 타입은 들어갈 수 없나. 그래서 java는 객체타입을 제공한다. 그것을 바로 래퍼 클래스(wrapper class)라고 한다.
        //int에 대한 wrapper class는 Integer이다. 각각의 레퍼 클래스가 있다.
//        Integer id =new Integer(1);
        Person<EmployInfo, Integer> p1 = new Person<EmployInfo, Integer>(new EmployInfo(1), 1);
        System.out.println(p1.info.rank);
    }
}
