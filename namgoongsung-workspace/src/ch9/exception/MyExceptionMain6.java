package ch9.exception;

public class MyExceptionMain6 {
    public static void main(String[] args) {
        try{
            System.out.println(1);
            throw new MyException("에러", 100);
        }catch(MyException e){
            if(e instanceof Exception)
                System.out.println("true");
            System.out.println("MyException");
        }finally{
            System.out.println(3);
        }
        System.out.println(1);
    }
}
