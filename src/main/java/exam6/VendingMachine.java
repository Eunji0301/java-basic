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

    int remainderMoney = 0;

    String[] beverageNames = {"콜라", "사이다", "커피"};
    int[] beveragePrices = {1000, 1200, 800};

    public void inputMoney(int money) {
        remainderMoney += money;
    }

    public String selectBeverage(int target) {
       if(beveragePrices[target] > remainderMoney) {
           return "잔액부족"; // return하게되면 메서드는 거기서 종료. 더 이상 밑으로 안내려감.
       }
       remainderMoney -= beveragePrices[target];
       return beverageNames[target];
    }

//    public int getRemainder() {
//        if (sumMoney < beveragePrice) {
//            System.out.println("잔액이 부족합니다.");
//        } else {
//            remainderMoney = sumMoney - beveragePrice;
//            sumMoney = remainderMoney;
//        }
//        return sumMoney;
//    }

}