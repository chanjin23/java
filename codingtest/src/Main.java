
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n=10;
        for (int i = 0; i < n; ++i) {
            list.add(new ArrayList<>());
            list.get(i).add(1);
            list.get(i).add(2);
            list.get(i).add(3);
            list.get(i).add(4);
            list.get(i).add(5);
            list.get(i).add(6);
            list.get(i).add(7);
            list.get(i).add(8);
        }
        for (ArrayList<Integer> integers : list) {

            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }


    }
}