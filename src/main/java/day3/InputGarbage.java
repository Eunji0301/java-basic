package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String args[]) {
        // 이름 입력 : 홍길동
        // 나이 입력 : 24

        // 안녕하세요 24살 홍길동입니다.
        Scanner scanner = new Scanner(System.in);

        // 숫자를 입력받을 때 문자로 받고 숫자로 변환 : Integer.parseInt()
//        int num = Integer.parseInt("1234");
//        System.out.println(num);

        System.out.print("나이 : ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }
}