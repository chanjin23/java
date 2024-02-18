package ch12.generics;

import java.util.ArrayList;

public class GenericsMain2 {
    private static class Product{}
    private static class Tv extends Product{}
    private static class Audio extends Product{}
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Tv> tvList = new ArrayList<>();

        productList.add(new Tv());  //add메서드가 지네릭으로 되어있기 때문에 Product완 관련된 자손들도 들어올 수 있다.
        productList.add(new Audio());

        tvList.add(new Tv());
//        tvList.add(new Audio());    //에러가 남


        printAll(productList);
//        printAll(tvList); //지네릭 타입이 맞지않아 에러가 남
    }

    private static void printAll(ArrayList<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
