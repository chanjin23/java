
import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static ArrayList<ArrayList<Point>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; ++i) {
            int node = sc.nextInt();
            int nextNode = sc.nextInt();
            int weight = sc.nextInt();
            list.get(node).add(new Point(nextNode, weight));
        }
        arr = new int[n + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);

        PriorityQueue<Point> pQ = new PriorityQueue<>();
        pQ.offer(new Point(1, 0));
        while (!pQ.isEmpty()) {
            Point tmp = pQ.poll();
            int currentNode = tmp.nextNode;
            int currentWeight = tmp.weight;
            if(arr[currentNode] <currentWeight) continue;
            for (Point p : list.get(currentNode)) {
                if (arr[p.nextNode] > currentWeight + p.weight) {
                    arr[p.nextNode] = currentWeight + p.weight;
                    pQ.offer(new Point(p.nextNode, currentWeight + p.weight));
                }
            }
        }
        for (int i = 2; i <= n; ++i) {
            if (arr[i] == Integer.MAX_VALUE) {
                System.out.println(i+" : impossible");
            }else{
                System.out.println(i+" : "+ arr[i]);
            }
        }

    }
    public static class Point implements Comparable<Point>{
        int nextNode;
        int weight;

        public Point(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return weight - o.weight;
        }
    }
}