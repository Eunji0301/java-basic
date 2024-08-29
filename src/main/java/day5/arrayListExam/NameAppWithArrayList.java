package day5.arrayListExam;

import java.util.ArrayList;
import java.util.Scanner;

public class NameAppWithArrayList {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        String[] names = new String[5];
        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Tomas");
        names.add("John");
        names.add("Becky");

//        int[] ages = new int[5];
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(24);
        ages.add(45);
        ages.add(18);
        ages.add(26);

        while (true) {
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
                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.nextLine();
                System.out.print("나이를 입력해주세요 : ");
                int age = Integer.parseInt(scanner.nextLine());

                names.add(name);
                ages.add(age);

                System.out.println(name + "이/가 명부에 저장되었습니다.");
            }
            else if (cmd.equals("list")) {
                System.out.println("===== 이름 목록 =====");
                for (int i = 0; i < names.size(); i++) {
                    System.out.println(i + 1 + ". " + names.get(i) + ", " + ages.get(i));
                }
                System.out.println("=====================");
            }
            else if (cmd.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }
        }
    }
}
