package memory;

public class Data2 {
    private String name;
    private static int count;

    public Data2(String name) {
        this.name = name;
//        Data2.count++;
        count++;
        //static은 공간이 하나 밖에 없기 때문에 count를 한다는 것이 가능하다.
    }
}
