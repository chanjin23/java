package ch11.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQueueMain3 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE=5;    //Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");

        while (true) {
            System.out.println(">>");
            try{
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;   // 값이 들어있지 않으면 넘긴다.
                }
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); //q를 입력하면 프로그램 종료
                } else if (input.equalsIgnoreCase("help")) {
                    //대소문자 구분 안하는 명령어 equalsIgnoreCase
                    System.out.println(" help - 도움말을 보여줍니다");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다");
                    System.out.println(" history - 최근에 입력한 명령어를 " +MAX_SIZE+ "개 보여줍니다");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);

                    //Queue에는 다양한 메서드들이 없어서 LinkedList로 형변환해서 값을 보여준다.
                    //LinkedList의 내용을 보여준다.
                    LinkedList list =(LinkedList) q;

                    //for문안에 list.size가 들어가있는건 while문이 돌아갈 때마다
                    //list.size() 메서드를 호출하기 때문에 바람직한 코딩이 아니다.
                    //list.size()는 변하지 않은 값이기 때문에 상수로 바꿔놓고 하면 더 빠른 실행속도를 얻을 수있다.
//                    for(int i=0;i<list.size();++i){
//                        System.out.println((i + 1) + "." + list.get(i));
//                    }

                    final int SIZE= list.size();
                    for(int i=0;i<SIZE;++i){
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                }else{
                    save(input);
                    System.out.println(input);
                }
            }catch(Exception e){
                System.out.println("입력 오류입니다");
            }
        }

    }

    private static void save(String input) {
        //queue에 저장한다.
        if (!"".equals(input)) {/*if( input !=null && !input.equals("") 이문장을 줄이기 위해서 다음과 같이 설정한다.*/
            //만약 if(!input.equals("")로 해버리면 input이 null일때 nullPointerException이 터짐
            //공백을 제외한 모든 문자에 대해 저장한다.
            q.offer(input);
        }

        //queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}
