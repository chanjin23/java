package start;

public class ex1 {
    public static void main(String[] args) {
        long n=100000;
        int[] answer = {};
        //1,2,3,4,5  뒤집기
        // 스위칭
        int i=0;
        long tmp2 =n;
        while(n>0){
            answer[i]= (int) (n%10);
            tmp2/=10;
        }

    }
}
