package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanenr = new Scanner(System.in);

        ArrayList<Integer> post_numbers = new ArrayList<>();
        ArrayList<String> post_titles = new ArrayList<>();
        ArrayList<String> post_bodies = new ArrayList<>();

        int postCount = 0;

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scanenr.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scanenr.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = scanenr.nextLine();

                postCount++;
                post_numbers.add(postCount);
                post_titles.add(title);
                post_bodies.add(body);
            } else if (cmd.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < post_titles.size(); i++) {
                    System.out.println("번호 : " + post_numbers.get(i));
                    System.out.println("내용 : " + post_bodies.get(i));
                    System.out.println("==================");
                }
            }
            else if (cmd.equals("update")) {

            }
        }
    }
}
