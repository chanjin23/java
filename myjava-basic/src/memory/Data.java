package memory;

public class Data {
    private String name;

    public Data(String name,DataCount count) {
        this.name = name;
        count.count++;
    }
}
