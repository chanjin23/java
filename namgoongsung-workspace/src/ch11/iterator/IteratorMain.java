package ch11.iterator;

import java.lang.reflect.Array;
import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        Collection list = new HashSet();
        //다음과 같이 HashSet말고  Collection으로 하면 Collection의 메서드들은
        //Collection에서 필요한 기능들만 쓴것이기 때문에 나중에 코드를 변경할 때 아래코드를 변경할 필요가 없다.
        //그래서 Collection에만 있는 기능들을 만약 사용했다면 다음과 같이 코드를 작성하는 것이 좋은 코드이다.

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }


        //iterator에서 이미 전부 읽어왔기 때문에 false를 반환한다.
        //그래서 만약 다시 iterator를 사용하고싶으면 다시 얻어와야한다.
//        it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        //다음과 같이 작성해도 되나 만약 ArrayList 대신에  HashSet같은 다른 컬렉션프레임워크를 사용하게되면
        //해당 메서드가 존재하지 않으므로 에러가 나게 된다.
        //iterator를 사용하면 아래의 코드를 바꾸지 않아도 컬렉션프레임워크만 바꿔도 오류가 나지 않는다.
        for(int i=0;i<list.size();++i){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
