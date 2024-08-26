package day2;
// == 계산기 프로그램 v1 ==
// 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 1
// 첫번째 숫자를 입력해주세요 : 22
// 두번째 숫자를 입력해주세요 : 44
// 결과 : 22 + 44 = 66
// 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 3(입력)
// 첫번째 숫자를 입력해주세요 : 2(입력)
// 두번째 숫자를 입력해주세요 : 4(입력)
// 결과 : 2 * 4 = 8
// 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 6(입력)
// 그런 기능은 존재하지 않습니다.
// 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 7(입력)
// 그런 기능은 존재하지 않습니다.
// 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 5(입력)
// 계산기 프로그램을 종료합니다.

import java.util.Scanner;

public class exam13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int num1 = scanner.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int num2 = scanner.nextInt();

                int add = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + add);
            }
            else if (option == 2) {
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int num1 = scanner.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int num2 = scanner.nextInt();

                int sub = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sub);
            }
            else if (option == 3) {
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int num1 = scanner.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int num2 = scanner.nextInt();

                int mul = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + mul);
            }
            else if (option == 4) {
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int num1 = scanner.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int num2 = scanner.nextInt();

                int div = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
            }
            else if (option == 5) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("그런 기능은 존재하지 않습니다.");
            }
        }
    }
}