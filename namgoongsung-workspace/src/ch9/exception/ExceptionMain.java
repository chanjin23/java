package ch9.exception;

public class ExceptionMain {
    public static void main(String[] args) {
        try{
            Math math =new Math();
            int value=math.divide(3, 0);
            System.out.println(value);
        }catch (ArithmeticException e ){
            System.out.println("예외발생");
        }

        
    }
}
