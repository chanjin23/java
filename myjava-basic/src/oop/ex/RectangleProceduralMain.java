package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedural rectangle =new RectangleProcedural();
        rectangle.height=5;
        rectangle.width =5;

        int area = rectangle.area();
        int perimeter = rectangle.perimeter();
        boolean square = rectangle.square();
        if(square){
            System.out.println("정사각형입니다");
        }else{
            System.out.println("정사각형이 아닙니다");
        }

    }
}
