package ch12.enum1;

public enum Direction {
    EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");

    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;

    Direction(int value, String symbol) {   //접근제어자 private이 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue(){return value;}
    public String getSymbol(){return symbol;}

    public static Direction of(int dir){
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value: : " + dir);  //1~4범위의 값을 벗어나면 예외발생
        }
        return DIR_ARR[dir-1];
    }

    public Direction rotate(int num){
        num = num % 4;  //1~4보다 값이 더커지는것을 방지

        if(num<0) num += 4;

        return DIR_ARR[(value - 1 + num) % 4];
    }

    @Override
    public String toString(){
        return name() + getSymbol();
    }
}
