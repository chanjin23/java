package construct;

public class MemberThisMain {
    public static void main(String[] args) {
        MemberThis member =new MemberThis();
        member.initMember("이찬진");
        System.out.println(member.nameField);
    }
}
