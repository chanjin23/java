package memory;

public class DataCountMain {
    public static void main(String[] args) {
        DataCount count =new DataCount();
        Data data1 =new Data("A",count);
        System.out.println("A count ="+ count.count);

        Data data2 =new Data("B",count);
        System.out.println("B count ="+ count.count);

        Data data3 =new Data("C",count);
        System.out.println("C count ="+ count.count);

    }
}
