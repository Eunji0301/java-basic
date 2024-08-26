package day2;

import java.util.Scanner;

public class exam11 {
    public static void main(String[] args) {

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 단을 입력해주세요 : ");
        int dan = scanner.nextInt();

        if (dan == 2) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 3) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 4) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 5) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 6) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 7) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 8) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        else if (dan == 9) {
            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
    }
}
