package ch9.hashcodetostring;

public class HashcodeMain {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = "abc";
        if(str3==str4)
            System.out.println("str3==str4");
        if(str1==str3)
            System.out.println("str1==str3");
        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2))");
        }

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println("str1.toString()= "+str1.toString());

        System.out.println(str1);

    }
}
