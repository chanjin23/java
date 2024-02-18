package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        DecoUtil1 utils1 = new DecoUtil1();
        String deco1 = utils1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after : " +deco);
    }
}
