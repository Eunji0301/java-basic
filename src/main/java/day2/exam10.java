package day2;

import java.util.Scanner;

//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45
public class exam10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }


}
