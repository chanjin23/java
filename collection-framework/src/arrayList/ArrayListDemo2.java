package arrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();     //옛날 방식은 get메서드를 사용할 때마다 형변환을 시키는 방식으로 해왔지만, 값이 불안정하다. 그렇기 때문에 generic방식을 사용한다.
        //generic이란 데이터의 타입을 일반화 하다 라는 뜻이다.

        al.add("one");  //add의 인자는 어떤 데이터타입도 들어갈 수 있다. -> 즉, add의 데이터 타입의 인자는 object이어야한다.
        al.add("two");
        al.add("three");

        for(int i=0;i<al.size();++i){
            String value = al.get(i);  //generic방식을 이용했기 때문에 String으로 반환해도 오류가 나지 않는 것을 확인할 수 있다.
            System.out.println(value);
        }
        //배열과 달리 배열의 길이를 나타내는 length는 ->  size()를 사용해야하고
        //값을 불러올때는 get메서드와 인자가 인덱스 번호가 들어가야 한다.


        //ArrayList는 배열의 크기를 지정해주지않아도 된다는 장점이있다.
        //이런식으로 하면 Out of Bounds 오류가 나지 않는다.
        //c++에서 vector와 비슷한 개념
    }


}
