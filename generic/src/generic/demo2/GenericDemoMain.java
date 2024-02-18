package generic.demo2;



public class GenericDemoMain {
    public static void main(String[] args) {
        Person p1 =new Person("부장");
        EmployInfo ei= (EmployInfo)p1.info;
    }
}
