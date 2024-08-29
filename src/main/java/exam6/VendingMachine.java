package exam6;

public class VendingMachine {
    // 값 세팅 X
    // 연습용으로 하나의 객체만 사용할 때에는 미리 넣어두는 것이 편하니까 그냥 넣어둠.

    int remainderMoney = 0;

    String[] beverageNames = {"콜라", "사이다", "커피"};
    int[] beveragePrices = {1000, 1200, 800};

    public void printBeverage() {
        System.out.println("== 음료수 목록 ==");
        for(int i = 0; i < beverageNames.length; i++) {
            System.out.println(i + ". " + beverageNames[i] + " : " + beveragePrices[i] + "원");
        }
        System.out.println("=================");
    }

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

    public int getRemainder() {
        return remainderMoney;
    }
}