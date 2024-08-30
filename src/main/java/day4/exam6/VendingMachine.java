package day4.exam6;

import java.util.ArrayList;

// 명령 코드 => 연산은 class에서 실행 불가능 => 연산은 메서드에서만 가능
// 클래스에는 변수, 메서드밖에 못옴.

public class VendingMachine {
    // 값 세팅 X
    // 연습용으로 하나의 객체만 사용할 때에는 미리 넣어두는 것이 편하니까 그냥 넣어둠.

    int remainderMoney = 0;

    //    String[] beverageNames = {"콜라", "사이다", "커피"};
    ArrayList<String> beverageNames = new ArrayList<>() {{
        add("콜라");
        add("사이다");
        add("커피");
    }};

    //    int[] beveragePrices = {1000, 1200, 800};
    ArrayList<Integer> beveragePrices = new ArrayList<>() {{
        add(1000);
        add(1200);
        add(800);
    }};

    //    int[] beverageNum = {1, 2, 1};
    ArrayList<Integer> beverageNum = new ArrayList<>() {{
        add(1);
        add(2);
        add(1);
    }};

    public void printBeverage() {
        System.out.println("== 음료수 목록 ==");
        for (int i = 0; i < beverageNames.size(); i++) {
            System.out.println(i + ". " + beverageNames.get(i) + " : " + beveragePrices.get(i) + "원" + ", 남은 수량 : " + beverageNum.get(i));
        }
        System.out.println("=================");
    }

    public void inputMoney(int money) {
        remainderMoney += money;
    }

    public String selectBeverage(int target) {
        if (beveragePrices.get(target) > remainderMoney) {
            return "잔액부족"; // return하게되면 메서드는 거기서 종료. 더 이상 밑으로 안내려감.
        }
        if (beverageNum.get(target) <= 0) {
            return "수량부족";
        }

        // 증감연산의 경우 짧게 표현하는 방법 존재
        remainderMoney -= beveragePrices.get(target); // remainderMoney = remainderMoney - beveragePrices[target];
//        beverageNum[target] -= 1; // beverageNum[target] = beverageNum[target] - 1;
        beverageNum.set(target, beverageNum.get(target) - 1);
        return beverageNames.get(target);
    }

    public int getRemainder() {
        return remainderMoney;
    }
}

