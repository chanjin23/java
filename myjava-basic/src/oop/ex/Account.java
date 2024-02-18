package oop.ex;

public class Account {
    //잔액
    int balance;

    //입금 메서드
    void deposit(int amount){
        balance+=amount;
    }
    //출금 메서드
    void withdraw(int amount){
        if(balance-amount>=0){
            balance-=amount;
        }
        else {
            System.out.println("잔액부족");
        }
    }
}
