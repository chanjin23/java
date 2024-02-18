package poly.ex.pay1;

public abstract class PayStore {
    //인스턴스를 생성하지말라고 abstract선언
    public static Pay findPay(String option){
        Pay pay;
        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        }else if(option.equals("new")){
            pay=new NewPay();
        }else {
            pay= new DefaultPay();
        }
        return pay;
    }
}
