package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("1");
        Data1 data2 = new Data1("2");
        Data1 data3 = new Data1("3");
        System.out.println(Data1.count);
        //클래스를 통해서 접근 -> 스태틱 변수는 공간이 하나이기 때문에
        System.out.println(data1.count);
        //인스턴스를 통해서 접근을 할 수도 있지만 바람직하지는 않다.
    }


}
