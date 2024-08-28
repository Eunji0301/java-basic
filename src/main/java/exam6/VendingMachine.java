package exam6;

public class VendingMachine {
    public void printBeverage() {
        System.out.println("== 음료수 목록 ==");
        System.out.println("0. 콜라 : 1000원");
        System.out.println("1. 사이다 : 1200원");
        System.out.println("2. 커피 : 800원");
        System.out.println("=================");
    }

    int sumMoney = 0;
    int beveragePrice = 0;
    int remainderMoney = 0;

    public void inputMoney(int money) {
        sumMoney = money;
    }

    public String selectBeverage(int num) {
        String beverageName = "";

        if (num == 0) {
            beverageName = "콜라";
            beveragePrice = 1000;
        }
        else if (num == 1) {
            beverageName = "사이다";
            beveragePrice = 1200;
        }
        else if (num == 2) {
            beverageName = "커피";
            beveragePrice = 800;
        }
        return beverageName;
    }

    public int getRemainder() {
        if (sumMoney < beveragePrice) {
            System.out.println("잔액이 부족합니다.");
        }
        else {
            remainderMoney = sumMoney - beveragePrice;
            sumMoney = remainderMoney;
        }
        return sumMoney;
    }
}