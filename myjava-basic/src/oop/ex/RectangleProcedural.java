package oop.ex;

public class RectangleProcedural {
    int width;
    int height;
    int area(){
        System.out.println("직사각형의 넓이:"+ width*height);
        return width*height;
    }
    int perimeter(){
        System.out.println("둘레 길이:"+ (width+height)*2);
        return (width+height)*2;
    }
    boolean square(){
        if(width==height){
            return true;
        }
        else{
            return false;
        }
    }


}
