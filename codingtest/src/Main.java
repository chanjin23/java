//코딩테스트용 컴파일 확인용도
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < n; ++i) {
            char[] ch = arr[i].toCharArray();
            int lt = 0;
            int rt = arr[i].length() - 1;
            while (lt <= rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
