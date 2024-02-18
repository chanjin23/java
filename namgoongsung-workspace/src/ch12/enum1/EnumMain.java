package ch12.enum1;


public class EnumMain {
    enum Direction{EAST, SOUTH, WEST, NORTH,}
    public static void main(String[] args) {
        //열거형을 얻어오는 방법이 3가지가 있는데 그 중 첫번째를 가장많이 사용한다.
        Direction d1 = Direction.EAST;  // 열거형타입.상수이름 으로 값을 얻어와도됨.
        Direction d2 = Direction.valueOf("WEST");  //문자열을 이용해서 얻어 올수 있다.
        Direction d3 = Enum.valueOf(Direction.class, "EAST");  //열거형의 최고 조상Enum 을이용해서 얻어올 수 도있다.

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ?" + (d1 == d2));
        System.out.println("d1==d3 ?" + (d1 == d3));
        System.out.println("d1.equals(d3) ?" + d1.equals(d3));
//        System.out.println((d1 > d3));  //비교연산자는 에러가남
        System.out.println("(d1.compareTo(d2)) ?"+(d1.compareTo(d2)));
        System.out.println("(d1.compareTo(d3)) ?"+(d1.compareTo(d3)));

        switch(d1){
            case EAST:   //Direction.EAST라고 쓸 수 없다. 문법임 그냥
                System.out.println("The direction is EAST.");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH.");
                break;
            case WEST:
                System.out.println("The direction is WEST.");
                break;
            case NORTH:
                System.out.println("The direction is NORTH.");
                break;
        }
        Direction[] dArr = Direction.values();  //열거형의 모든 상수를 배열로 반환
        for (Direction d : dArr) {
            System.out.println(d.name() + ":" + d.ordinal());   //값: 순서(인덱스) 반환
            //순서랑 상수가 가지고 있는 값과 다를 수 있다.
        }
    }
}
