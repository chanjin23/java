package ch11.stackqueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueueMain2 {
    public static void main(String[] args) {
        //괄호를 검사하는 코드
        Stack st = new Stack();
        String expression = "((3+5)*8 -2)";
        if (expression.length() < 1) {
            System.out.println("값을 넣어주세요");
            System.exit(0);
        }
        System.out.println("expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); ++i) {
                char ch = expression.charAt(i); //한문자씩 꺼낸다.

                if (ch == '(') {
                    st.push(ch + "");   //'('가 있으면 push
                    //""를 붙이는 이유는 ch가 기본데이터 형식인 char형이므로 String객체로 바꾼것임
                    //오토박싱한것
                } else if (ch == ')') {
                    st.pop();   //')'가 있으면 pop
                }
            }

            if (st.empty()) {
                //스택이 비어있으면
                System.out.println("괄호가 일치합니다");
            } else {
                //스택이 비어있지 않으면  '('가 ')'보다 더많은 경우
                System.out.println("괄호가 일치하지 않습니다");
            }
        } catch (EmptyStackException e) {
            //더이상 꺼낼 데이터가 없어서 예외가 터지는 경우 ')'가  '('보다 더많은 경우
            System.out.println("괄호가 일치하지 않습니다");
        }
    }
}
