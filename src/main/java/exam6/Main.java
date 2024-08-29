package exam6;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        while (true) {
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3. 음료 목록 확인, 4. 잔액 확인, 5. 사용 종료) : ");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                System.out.print("돈을 투입해주세요 : ");
                int money = Integer.parseInt(scanner.nextLine());
                vm.inputMoney(money);
                System.out.println("현재 투입된 금액은 " + money + "원입니다.");
            }
            else if (option == 2) {
                System.out.print("음료수를 선택해주세요 : ");
                int target = Integer.parseInt(scanner.nextLine());
                String beverage = vm.selectBeverage(target);
                if(beverage.equals("잔액부족")){
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }

                System.out.println(beverage + "을/를 뽑으셨습니다.");
                int remainder = vm.getRemainder();
                System.out.println("잔액은 " + remainder + "원입니다.");
            }
            else if (option == 3) {
                vm.printBeverage();
            }
            else if (option == 4) {
                int remainder = vm.getRemainder();
                System.out.println("현재 잔액은 " + remainder + "원입니다.");
            }
            else if (option == 5) {
                int remainder = vm.getRemainder();
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + remainder + "원이 반환됩니다.");
                break;
            }
        }
    }
}