package ch9.equal;

public class EqualMain {
    public static void main(String[] args) {
        Value value1 = new Value(10);
        Value value2 = new Value(10);

        if(value1.equals(value2))
            System.out.println("v1과 v2는 같다.");
        else
            System.out.println("v1과 v2는 다르다.");
    }
}
