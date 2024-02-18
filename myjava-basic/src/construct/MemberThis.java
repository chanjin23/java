package construct;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter){
        nameField=nameParameter;
        //예전에는 this를 쓰면 클래스 안에 있는 멤버 변수라고 해쓴데 요즘 IDE가 개발되면서 멤버 변수를 쓰면 색상으로 구분해준다.
    }
}
