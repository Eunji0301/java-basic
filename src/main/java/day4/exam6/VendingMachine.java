package day4.exam6;

import java.util.ArrayList;

// 명령 코드 => 연산은 class에서 실행 불가능 => 연산은 메서드에서만 가능
// 클래스에는 변수, 메서드밖에 못옴.

public class VendingMachine {
    // 값 세팅 X
    // 연습용으로 하나의 객체만 사용할 때에는 미리 넣어두는 것이 편하니까 그냥 넣어둠.

    int remainderMoney = 0;
    ArrayList<Beverage> beverages = new ArrayList<>();

    public VendingMachine() {
        Beverage b1 = new Beverage("콜라",1000,1);
        Beverage b2 = new Beverage("사이다",1200,2);
        Beverage b3 = new Beverage("커피",800,1);

        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }

    public void printBeverage() {
        System.out.println("== 음료수 목록 ==");
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원" + ", 남은 수량 : " + beverages.get(i).quantity);
        }
        System.out.println("=================");
    }

    public void inputMoney(int money) {
        remainderMoney += money;
    }

    public String selectBeverage(int target) {
        Beverage beverage = beverages.get(target);

        if (beverage.price > remainderMoney) {
            return "잔액부족"; // return하게되면 메서드는 거기서 종료. 더 이상 밑으로 안내려감.
        }
        if (beverage.quantity <= 0) {
            return "수량부족";
        }

        // 증감연산의 경우 짧게 표현하는 방법 존재
        remainderMoney -= beverage.price; // remainderMoney = remainderMoney - beveragePrices[target];
//        beverageNum[target] -= 1; // beverageNum[target] = beverageNum[target] - 1;
        beverage.quantity -= 1;
        return beverage.name;
    }

    public int getRemainder() {
        return remainderMoney;
    }
}