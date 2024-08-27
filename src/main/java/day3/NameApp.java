package day3;

// 명명 규칙
// 클래스명은 대문자로 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름지을 때 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로
// 카멜 표기법
// 함수나 변수는 소문자로 시작.
// 상수는 모두 대문자 띄어쓰기는 _

import java.util.Scanner;

public class NameApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        while(true) {
            System.out.print("명령어 입력 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("help")) {
                System.out.println("=====================");
                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 이름 종료");
                System.out.println("=====================");
            }
            else if (cmd.equals("add")) {
                for(int i = 0; i < names.length; i++) {
                    System.out.print("이름을 입력해주세요 : ");
                    names[i] = scanner.nextLine();
                    System.out.println(names[i] + "가 명부에 저장되었습니다.");
                }
            }
            else if (cmd.equals("list")) {
                System.out.println("===== 이름 목록 =====");
                for(int i = 0; i < names.length; i++) {
                    System.out.println(i+1 + ". " + names[i]);
                }
                System.out.println("=====================");
            }
            else if (cmd.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }
        }
        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // 2. tomas
        // 3. chris
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.
    }
}