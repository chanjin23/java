package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObject = new String[2];
        arrayObject[0] ="one";
        arrayObject[1] ="two";
//        arrayObject[2] ="three";
        for(int i=0;i<arrayObject.length;++i)
        {
            System.out.println(arrayObject[i]);
        }
        //기존 배열은 배열의 크기를 지정해주면 변경할 수 없는 한계점이 있었다.

        ArrayList al = new ArrayList();
        al.add("one");  //add의 인자는 어떤 데이터타입도 들어갈 수 있다. -> 즉, add의 데이터 타입의 인자는 object이어야한다.
        al.add("two");
        al.add("three");
        for(int i=0;i<al.size();++i){
//            String value =al.get(i);    //즉 , add함수로 get을 불러온다는 것은 인자 i는 "one"이 된다는 것이댜 -> i의 인자는 object타입이다.
//            System.out.println(value);
            String value = (String) al.get(i);  //지금 해당 변수는 데이터 타입을 String으로 불러오기 때문에 해당 데이터 타입을 맞추기 위해서는 형변환을 시켜줘야한다.
            System.out.println(value);
            System.out.println(al.get(i));
        }
        //배열과 달리 lenggth는 ->  size()를 사용해야하고
        //값을 불러올때는 get메서드와 인자가 인덱스 번호가 들어가야 한다.


        //ArrayList는 배열의 크기를 지정해주지않아도 된다는 장점이있다.
        //이런식으로 하면 Out of Bounds 오류가 나지 않는다.
    }


}
