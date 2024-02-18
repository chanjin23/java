package ch9.equal;

public class EqualMain2 {
    public static void main(String[] args) {
        Person p1 =new Person(123123213L);
        Person p2 = new Person(123123213L);

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다");
        }
    }
}
