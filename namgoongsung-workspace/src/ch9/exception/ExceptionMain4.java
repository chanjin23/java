package ch9.exception;

public class ExceptionMain4 {
    public static void main(String[] args) {
//        throw  new Exception();// 컴파일 오류가 남 try-catch문으로 감싸줘야됨.
        try{
            throw new Exception();
        }catch (Exception e){
        }
        throw new RuntimeException();   //try-catch문에 감싸지 않아도 컴파일 오류가 나지 않음
    }
}
