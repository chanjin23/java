package ch9.exception;

import java.io.File;

public class ExceptionMain5 {
    public static void main(String[] args) {
        try{
            File f =createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
        }catch(Exception e){
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다");
        }
    }

    private static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다");//file이 null이거나 아무 문자열도 들어오지 않으면 예외발생
        }
        File f= new File(fileName);
        f.createNewFile();  //파일 생성
        return f;
    }
}
