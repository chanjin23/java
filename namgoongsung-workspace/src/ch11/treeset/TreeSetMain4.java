package ch11.treeset;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetMain4 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        //b 에서 d까지 찾고싶은 코드
        String from = "b";
        String to = "d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("Car"); set.add("Car"); set.add("disc");
        set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
        set.add("car");

        System.out.println(set);
        System.out.println("range research: from " + from + "to" + to);
        System.out.println("result1 : " + set.subSet(from, to));        //b<= x <d
        System.out.println("result2 : " + set.subSet(from, "dzzz"));//b<= x <dzzz
    }
}
