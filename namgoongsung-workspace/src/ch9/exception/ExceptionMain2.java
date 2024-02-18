package ch9.exception;

public class ExceptionMain2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(ArithmeticException ae){
            if(ae instanceof ArithmeticException) //만약 ae가 ArithmeticExcpetion의 인스턴스를 참조하고있니
                System.out.println("true");
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
