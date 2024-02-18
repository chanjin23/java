package ch9.hashcodetostring;

public class toStringMain {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1);
    }
}
