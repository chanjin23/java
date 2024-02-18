package construct;

public class MemberConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1= new MemberConstruct("user1",15,90);
        MemberConstruct member2= new MemberConstruct("user2",16,80);
        MemberConstruct member3= new MemberConstruct("user3",17,70);
        
        MemberConstruct[] members= {member1,member2,member3};
        for (MemberConstruct m : members) {
            System.out.println("생성자 호출 name ="+ m.name +", age= "+ m.age+"grade="+m.grade);
        }
    }
}
