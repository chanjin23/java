package ch9.exception;

public class ExceptionMain3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(args[0]);
            System.out.println(4);
        }catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        }catch(Exception e){
            System.out.println("ArrayIndexOutofBoundsException");
        }
        System.out.println(6);
    }
}
