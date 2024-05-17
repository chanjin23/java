package swexpertacademy.difficult3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol20551 {
    static int[] dx = {1, 0, 0};
    static int[] dy = {0, 1, 0};
    static int[] dz = {0, 0, 1};
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a >= 1 && b >= 1 && c >= 1 && a < b && b < c) {
                System.out.println(0);
                continue;
            }
            System.out.println(bfs(a, b, c));
        }
    }

    public static int bfs(int a, int b, int c) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(a, b, c));
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 3; ++i) {
                int nx = dx[i] + tmp.x;
                int ny = dy[i] + tmp.y;
                int nz = dz[i] + tmp.z;
                if (nx >= 1 && ny >= 1 && nz >= 1 && nx < ny && ny < nz) {
                    return count;
                }
                if(nx >= 1 && ny >= 1 && nz >= 1) q.offer(new Point(nx, ny, nz));
            }
            count++;
        }
        return -1;
    }
    public static class Point{
        int x;
        int y;
        int z;

        Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
