package ref;


import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        ProductOrder[] orders=new ProductOrder[3];
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int n = scanner.nextInt();
        scanner.nextLine();
        //1\n nextInt가 개행문자까지 받아버려서 nextLine을 한번 적어놓고  해야한다.
        for (int i = 0; i < n; i++) {
            System.out.print("상품명: ");
            String productName =scanner.nextLine();
            System.out.print("가격: ");
            int price =scanner.nextInt();
            System.out.print("수량: ");
            int quantity =scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity);
        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);


    }
    static ProductOrder createOrder(String productName,int price,int quantity ){
        ProductOrder productOrder =new ProductOrder();
        productOrder.productName =productName;
        productOrder.price =price;
        productOrder.quantity=quantity;
        return productOrder;
    }
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName+", 가격 : "+order.price +", 수량 : "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for (ProductOrder order : orders) {
            totalAmount+=order.price*order.quantity;
        }
        System.out.println("총 결제 금액: " +totalAmount);
        return totalAmount;
    }
}
