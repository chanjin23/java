import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;++i){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(map.size() + " ");
        for (int i = 0; i <= n - k-1; ++i) {
            map.put(arr[i], map.get(arr[i]) - 1);
            map.put(arr[i + k], map.getOrDefault(arr[i + k], 0) + 1);
            if(map.get(arr[i])==0) map.remove(arr[i]);
            System.out.print(map.size() + " ");
        }
    }
}