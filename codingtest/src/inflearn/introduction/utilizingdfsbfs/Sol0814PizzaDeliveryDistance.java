package inflearn.introduction.utilizingdfsbfs;

import java.io.*;
import java.util.*;


public class Sol0814PizzaDeliveryDistance {
    static ArrayList<Point> home,pizza;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    home.add(new Point(i, j));
                } else if (arr[i][j] == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        dfs(0, 1);
    }

    public static void dfs(int level, int sum) {
        if (level == sum) {

        }else{
            for (int i = level; i < pizza.size(); ++i) {

            }
        }
    }
    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
