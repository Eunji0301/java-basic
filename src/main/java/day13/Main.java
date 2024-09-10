package day13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

        ArrayList<Integer> post_numbers = new ArrayList<>();
        ArrayList<String> post_titles = new ArrayList<>();
        ArrayList<String> post_bodies = new ArrayList<>();
        ArrayList<Integer> post_views = new ArrayList<>();

        int postCount = 0;

        postCount++;
        post_numbers.add(postCount);
        post_titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        post_bodies.add("자바 너무 재밌어요!!");
        post_views.add(0);

        postCount++;
        post_numbers.add(postCount);
        post_titles.add("자바 질문좀 할게요~");
        post_bodies.add("BBB");
        post_views.add(0);

        postCount++;
        post_numbers.add(postCount);
        post_titles.add("정처기 따야되나요?");
        post_bodies.add("CCC");
        post_views.add(0);

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scanner.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = scanner.nextLine();

                postCount++;
                post_numbers.add(postCount);
                post_titles.add(title);
                post_bodies.add(body);
                post_views.add(0);
            } else if (cmd.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < post_titles.size(); i++) {
                    System.out.println("제목 : " + post_titles.get(i));
                    System.out.println("내용 : " + post_bodies.get(i));
                    System.out.println("==================");
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int num = Integer.parseInt(scanner.nextLine());
                int index = post_numbers.indexOf(num);

                if (num > post_titles.size() || num < 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("제목 : ");
                    String new_title = scanner.nextLine();
                    System.out.print("내용 : ");
                    String new_body = scanner.nextLine();

                    System.out.println(num + "번 게시물이 수정되었습니다.");

                    post_titles.set(index, new_title);
                    post_bodies.set(index, new_body);
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int num = Integer.parseInt(scanner.nextLine());
                int index = post_numbers.indexOf(num);

                if (num > post_titles.size() || num < 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.println(num + "번 게시물이 삭제되었습니다.");

                    post_numbers.remove(index);
                    post_titles.remove(index);
                    post_bodies.remove(index);
                    post_views.add(index);
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int num = Integer.parseInt(scanner.nextLine());
                int index = post_numbers.indexOf(num);

                if (num > post_titles.size() || num < 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    post_views.set(index, post_views.get(index) + 1);
                    System.out.println("===================");
                    System.out.println("번호 : " + post_numbers.get(index));
                    System.out.println("제목 : " + post_titles.get(index));
                    System.out.println("내용 : " + post_bodies.get(index));
                    System.out.println("등록날짜 : " + dateFormat.format(date));
                    System.out.println("조회수 : " + post_views.get(index));
                    System.out.println("===================");

                    System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                    int dnum = Integer.parseInt(scanner.nextLine());

                    while(true) {
                        if (dnum == 1) { // 댓글등록

                        }
                        else if (dnum == 5) { // 목록으로
                            System.out.println("상세보기 화면을 빠져나갑니다.");
                            break;
                        }
                    }
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요 : ");
                String keyword = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < post_titles.size(); i++) {
                    if (post_titles.get(i).contains(keyword)) {
                        System.out.println("===================");
                        System.out.println("번호 : " + post_numbers.get(i));
                        System.out.println("제목 : " + post_titles.get(i));
                        System.out.println("===================");
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("===================");
                    System.out.println("검색 결과가 없습니다.");
                    System.out.println("===================");
                }

            }
        }
    }
}