package day2;

import java.util.Scanner;

public class InputExam {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 반복문 추가 문법

        // 반복문 강제 종료 : break
        // 반복문 강제로 다음 회차 넘기기 : continue

//        for(int i = 1; i <= 10; i++) {
//            if (i == 5) {
////                break; // 강제 종료 : 1 2 3 4
//                continue; // 다음 회차 : 1 2 3 4 6 7 8 9 10
//            }
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 10; i++) {
//            // 짝수 출력
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        while(true) {
            System.out.print("값을 입력해주세요 : ");
            int num = scanner.nextInt();
            if ( num == 0) { // num이 0이면 if문 실행
                break; // 종료
            }
            System.out.println("당신이 입력한 값은 : " + num);
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
