package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData =new BigData();
//        bigData.data= new Data(); //data가 null을 가리키고 있으므로 객체를 생성해 새로운 참조 값을 가리키게 한다.
        System.out.println("bigData.data ="+bigData.data);
        System.out.println("bigData.count ="+bigData.count);

        //NullPointerException
        //정리 NullPointerException이 발생하면 null값에 null.value로 생각하면 쉽게 찾을 수 있다.
        System.out.println("bigData.value ="+bigData.data.value);
    }
}
