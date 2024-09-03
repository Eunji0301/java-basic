package day8.board;

import day2.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> post_number = new ArrayList<>();
        ArrayList<String> post_title = new ArrayList<>();
        ArrayList<String> post_body = new ArrayList<>();

        int postCount = 0;

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scanner.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = scanner.nextLine();
                System.out.println("게시물이 등록되었습니다.");

                postCount++;
                post_number.add(postCount);
                post_title.add(title);
                post_body.add(body);
            }
            else if (cmd.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < post_title.size(); i++) {
                    System.out.println("번호 : " + post_number.get(i));
                    System.out.println("제목 : " + post_title.get(i));
                    System.out.println("==================");
                }
            }
            else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int number = Integer.parseInt(scanner.nextLine());
                int index = post_number.indexOf(number);

                if (number > post_title.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                }
                else {
                    System.out.print("제목 : ");
                    String new_title = scanner.nextLine();
                    System.out.print("내용 : ");
                    String new_body = scanner.nextLine();
                    System.out.println(number + "번 게시물이 수정되었습니다.");

                    post_title.set(index, new_title);
                    post_body.set(index, new_body);
                }
            }
            else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int number = Integer.parseInt(scanner.nextLine());
                int index = post_number.indexOf(number);

                if (number > post_title.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                }
                else {
                    System.out.println(number+ "번 게시물이 삭제되었습니다.");

                    post_number.remove(index);
                    post_title.remove(index);
                    post_body.remove(index);
                }
            }
        }
    }
}
