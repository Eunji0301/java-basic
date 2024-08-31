package day6.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Hamburger> hamburgers = new ArrayList<>();
    ArrayList<Side> sides = new ArrayList<>();
    ArrayList<Drink> drinks = new ArrayList<>();

    ArrayList<Hamburger> hamburgerCart = new ArrayList<>();
    ArrayList<Side> sideCart = new ArrayList<>();
    ArrayList<Drink> drinkCart = new ArrayList<>();

    int sumMoney = 0;

    public Kiosk() {
        Hamburger h1 = new Hamburger(1, "한우불고기버거", 6000);
        Hamburger h2 = new Hamburger(2, "치즈버거", 3000);
        Hamburger h3 = new Hamburger(3, "치킨버거", 3500);
        Hamburger h4 = new Hamburger(4, "새우버거", 3200);

        hamburgers.add(h1);
        hamburgers.add(h2);
        hamburgers.add(h3);
        hamburgers.add(h4);

        Side s1 = new Side(1, "감자튀김", 1800);
        Side s2 = new Side(2, "치즈스틱", 2000);
        Side s3 = new Side(3, "치킨너겟", 2500);
        Side s4 = new Side(4, "오징어링", 2700);

        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);

        Drink d1 = new Drink(1, "콜라", 1000);
        Drink d2 = new Drink(2, "에이드", 2000);
        Drink d3 = new Drink(3, "커피", 1500);
        Drink d4 = new Drink(4, "쉐이크", 2500);

        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);
        drinks.add(d4);
    }
    public int getReturnMoney(int price) {
        int returnMoney = price - sumMoney;

        System.out.println("거스름돈 : " + returnMoney);
        System.out.println("이용해주셔서 감사합니다.");

        return returnMoney;
    }

    public void printReceipt() {
        System.out.println("===== 영수증 ===== ");
        System.out.print("햄버거 : [");
        for (int i = 0; i < hamburgerCart.size(); i++) {
            System.out.print(hamburgerCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.print("사이드 : [");
        for (int i = 0; i < sideCart.size(); i++) {
            System.out.print(sideCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.print("음료수 : [");
        for (int i = 0; i < drinkCart.size(); i++) {
            System.out.print(drinkCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.println("총금액 : " + sumMoney);

        System.out.println("====================");
    }
    public void cancelMenu(int target) {

        Hamburger hamburger = hamburgers.get(target - 1);

        System.out.println("품목을 선택해주세요.");
        if (target == 1) {
            for (int i = 0; i < hamburgerCart.size(); i++) {
                System.out.println(i + 1 + ". " + hamburgerCart.get(i).name);
            }
            System.out.print("선택 : ");
            int removeHamburger = scanner.nextInt() - 1;
            System.out.println(hamburgerCart.get(removeHamburger).name + "이 삭제되었습니다.");
            hamburgerCart.remove(removeHamburger);
            sumMoney -= hamburger.price;
        }
        else if (target == 2) {
            Side side = sides.get(target - 1);
            for (int i = 0; i < sideCart.size(); i++) {
                System.out.println(i + 1 + ". " + sideCart.get(i).name);
            }
            System.out.print("선택 : ");
            int removeSide = scanner.nextInt() - 1;
            System.out.println(sideCart.get(removeSide).name + "이 삭제되었습니다.");
            sideCart.remove(removeSide);
            sumMoney -= side.price;
        }
        else if (target == 3) {
            Drink drink = drinks.get(target - 1);
            for (int i = 0; i < drinkCart.size(); i++) {
                System.out.println(i + 1 + ". " + drinkCart.get(i).name);
            }
            System.out.print("선택 : ");
            int removeDrink = scanner.nextInt() - 1;
            System.out.println(drinkCart.get(removeDrink).name + "이 삭제되었습니다.");
            drinkCart.remove(removeDrink);
            sumMoney -= drink.price;
        }
    }

    public void printOrderList() {
        System.out.println("===== 주문 목록 ===== ");
        System.out.print("햄버거 : [");
        for (int i = 0; i < hamburgerCart.size(); i++) {
            System.out.print(hamburgerCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.print("사이드 : [");
        for (int i = 0; i < sideCart.size(); i++) {
            System.out.print(sideCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.print("음료수 : [");
        for (int i = 0; i < drinkCart.size(); i++) {
            System.out.print(drinkCart.get(i).name + " ");
        }
        System.out.println("]");

        System.out.println("총금액 : " + sumMoney);
    }

    public void printHamburger() {
        System.out.println("===== 햄버거 목록 =====");
        for (int i = 0; i < hamburgers.size(); i++) {
            System.out.println(hamburgers.get(i).num + ". " + hamburgers.get(i).name + " " + hamburgers.get(i).price);
        }
        System.out.println("=======================");
    }

    public String selectHamburger(int target) {
        Hamburger hamburger = hamburgers.get(target - 1); // 선택한 번호로 버거 가져오기
        hamburgerCart.add(hamburger); // 카트에 선택한 햄버거 추가
        for (int i = 0; i < hamburgerCart.size(); i++) {
            System.out.println(hamburgerCart.get(i).name);
        }
        sumMoney += hamburger.price;
        return hamburger.name;
    }

    public void printSide() {
        System.out.println("===== 사이드 목록 =====");
        for (int i = 0; i < sides.size(); i++) {
            System.out.println(sides.get(i).num + ". " + sides.get(i).name + " " + sides.get(i).price);
        }
        System.out.println("=======================");
    }

    public String selectSide(int target) {
        Side side = sides.get(target - 1);
        sideCart.add(side); // 카트에 선택한 햄버거 추가
        for (int i = 0; i < sideCart.size(); i++) {
            System.out.println(sideCart.get(i).name);
        }
        sumMoney += side.price;
        return side.name;
    }

    public void printDrink() {
        System.out.println("===== 음료수 목록 =====");
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).num + ". " + drinks.get(i).name + " " + drinks.get(i).price);
        }
        System.out.println("=======================");
    }

    public String selectDrink(int target) {
        Drink drink = drinks.get(target - 1);
        drinkCart.add(drink); // 카트에 선택한 햄버거 추가
        for (int i = 0; i < drinkCart.size(); i++) {
            System.out.println(drinkCart.get(i).name);
        }
        sumMoney += drink.price;
        return drink.name;
    }
}