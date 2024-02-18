package start;

public class Main {
    public static void main(String[] args) {
        String t ="500";
        String p ="7";
        int answer = 0;
        //먼저 p의 길이를 알아낸다.

        //p의길이만큼 t의 부분문자열 추출
        for(int i=0;i<t.length()-2;++i){
            String partString =t.substring(i,i+p.length());  //부분문자열
            System.out.println(Integer.parseInt(partString));
            if(Integer.parseInt(partString) <=Integer.parseInt(p) ){
                ++answer;
            }
        }
        System.out.println(answer);


    }
}
