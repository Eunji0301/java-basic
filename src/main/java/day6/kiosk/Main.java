package day6.kiosk;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        System.out.println("햄버거 키오스크 v1");
        while (true) {
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            System.out.println("5. 주문하기");

            kiosk.printOrderList();

            System.out.print("무엇을 하시겠습니까? : ");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                kiosk.printHamburger();
                System.out.print("어떤 버거를 고르시겠습니까? : ");
                int target = Integer.parseInt(scanner.nextLine());
                String hamburger = kiosk.selectHamburger(target);
                System.out.println(hamburger + "를 고르셨습니다.");

            }
            else if (option == 2) {
                kiosk.printSide();
                System.out.print("어떤 사이드를 고르시겠습니까? : ");
                int target = Integer.parseInt(scanner.nextLine());
                String side = kiosk.selectSide(target);
                System.out.println(side + "를 고르셨습니다.");
            }
            else if (option == 3) {
                kiosk.printDrink();
                System.out.print("어떤 음료수를 고르시겠습니까? : ");
                int target = Integer.parseInt(scanner.nextLine());
                String drink = kiosk.selectDrink(target);
                System.out.println(drink + "를 고르셨습니다.");
            }
            else if (option == 4) {
                System.out.println("어떤 메뉴를 취소하겠습니까? : ");
                System.out.println("1. 햄버거");
                System.out.println("2. 사이드");
                System.out.println("3. 음료수");
                System.out.print("선택 : ");
                int menu = Integer.parseInt(scanner.nextLine());
                kiosk.cancelMenu(menu);
            }
            else if (option == 5) {
                System.out.print("정말 주문하시겠습니까?(y/n) : ");
                String orderOption = scanner.nextLine();

                if(orderOption.equals("y")) {
                    System.out.print("결재 금액을 입력해주세요 : ");
                    int inputMoney = Integer.parseInt(scanner.nextLine());

                    System.out.print("영수증을 발급하시겠습니까?(y/n) : ");
                    String receiptOption = scanner.nextLine();

                    if(receiptOption.equals("y")) {
                        kiosk.printReceipt();
                        kiosk.getReturnMoney(inputMoney);
                        break;
                    }
                    else if (receiptOption.equals("n")) {
                        System.out.println("영수증 발급을 취소합니다.");
                    }
                }
                else if (orderOption.equals("n")) {
                    System.out.println("주문을 취소합니다.");
                }

            }
        }
    }
}