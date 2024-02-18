package ref.ex;

import java.util.Scanner;

public class PracticeProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요");
        int count = scanner.nextInt();
        scanner.nextLine();

        PracticeProductOrder[] orders=new PracticeProductOrder[count];

        for(int i=0;i<count;++i){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요");
            System.out.print("상품명:");
            String productName =scanner.nextLine();
            System.out.print("가격:");
            int price =scanner.nextInt();
            System.out.print("수량:");
            int quantity=scanner.nextInt();
            scanner.nextLine();

            orders[i]=createOrder(productName,price,quantity);
        }
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액:" +totalAmount);

    }

    static PracticeProductOrder createOrder(String productName, int price, int quantity){
        PracticeProductOrder orders =new PracticeProductOrder();
        orders.price= price;
        orders.productName= productName;
        orders.quantity =quantity;
        return orders;
    }
    static void printOrder(PracticeProductOrder[] orders){
        for (PracticeProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량:"+order.quantity);
        }
    }
    static int getTotalAmount(PracticeProductOrder[] orders){
        int totalAmount =0;
        for (PracticeProductOrder order : orders) {
            totalAmount+=order.price*order.quantity;
        }
        return totalAmount;
    }
}
