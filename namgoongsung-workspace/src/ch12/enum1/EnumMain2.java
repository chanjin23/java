package ch12.enum1;

public class EnumMain2 {
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            System.out.println(d.name() + "=" + d.getValue());
        }

        Direction d1=Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.println(d1.name() + "=" + d1.getValue());
        System.out.println(d2.name() + "=" + d2.getValue());
        System.out.println(Direction.EAST.rotate(1));       //EAST 객체에 접근 -> rotate
        System.out.println(Direction.EAST.rotate(2));       //2번회전
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));
        System.out.println();

        System.out.println(Direction.EAST.toString());
        System.out.println(Direction.WEST.toString());
        System.out.println(Direction.SOUTH.toString());
        System.out.println(Direction.NORTH.toString());

    }
}
