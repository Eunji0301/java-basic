package exam6;

public class VendingMachine {
    int num_coke = 1;
    int num_cidar = 2;
    int num_coffee = 1;

    public void printBeverage() {
        System.out.println("== 음료수 목록 ==");
        System.out.println("0. 콜라 : 1000원" + ", 남은 수량 : " + num_coke);
        System.out.println("1. 사이다 : 1200원" + ", 남은 수량 : " + num_cidar);
        System.out.println("2. 커피 : 800원" + ", 남은 수량 : " + num_coffee);
        System.out.println("=================");
    }

    // 값 세팅 X
    // 연습용으로 하나의 객체만 사용할 때에는 미리 넣어두는 것이 편하니까 그냥 넣어둠.
    int sumMoney = 0;
    int beveragePrice = 0;
    int remainderMoney = 0;


    public void inputMoney(int money) {
        remainderMoney += money;
    }

    public String selectBeverage(int num) {
        String beverageName = "";

        if (num == 0) {
            beverageName = "콜라";
            beveragePrice = 1000;
        } else if (num == 1) {
            beverageName = "사이다";
            beveragePrice = 1200;
        } else if (num == 2) {
            beverageName = "커피";
            beveragePrice = 800;
        }
        return beverageName;
    }

    public int getRemainder() {
        if (sumMoney < beveragePrice) {
            System.out.println("잔액이 부족합니다.");
        } else {
            remainderMoney = sumMoney - beveragePrice;
            sumMoney = remainderMoney;
        }
        return sumMoney;
    }

    public int getAmount() {
        if (num_coke < 0 || num_cidar < 0 || num_coffee < 0) {
            System.out.println("수량이 부족합니다.");
        }
        e

    }
}