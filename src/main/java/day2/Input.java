package day2;

import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //값 입력받기
        int num1 = scanner.nextInt();
        System.out.println("당신이 입력한 첫번째 값은 : " + num1);

        int num2 = scanner.nextInt();
        System.out.println("당신이 입력한 첫번째 값은 : " + num2);

        System.out.println(num1 + num2);

        System.out.println("==================================================");

        //문자열 입력받기
        System.out.print("첫 번째 값을 입력해주세요 : ");
        String str1 = scanner.nextLine();
        System.out.println("당신이 입력한 첫번째 값은 : " + str1);

        System.out.print("두 번째 값을 입력해주세요 : ");
        String str2 = scanner.nextLine();
        System.out.println("당신이 입력한 두번째 값은 : " + str2);
    }
}
