package ch14.rambdabasic;

public class RambdaMain {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b; //람다식은 익명객체이므로 참조변수에 담아야한다.
        //Object는 최고 조상으로
        Object obj =new Object(){
            int max(int a, int b){
                return a > b ? a : b;
            }
        };
//        int value =obj.max(3,5);    //Object에는 max라는 리모컨이 없기 때문에
        //내가 객체르 max가 있는걸로 생성을 했지만 Object는 max리모컨을 가지고 있지 않기때문에 에러가 난다.
    }
}
