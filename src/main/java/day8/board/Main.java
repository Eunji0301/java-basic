package day8.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date now = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String formatedNow = formatter.format(now);

        ArrayList<Integer> post_number = new ArrayList<>();
        ArrayList<String> post_title = new ArrayList<>();
        ArrayList<String> post_body = new ArrayList<>();
        ArrayList<Integer> post_view = new ArrayList<>();

        ArrayList<String> sign_id = new ArrayList<>();
        ArrayList<String> sign_pw = new ArrayList<>();
        ArrayList<String> sign_nickname = new ArrayList<>();

        int postCount = 0;
        postCount++;
        post_number.add(postCount);
        post_title.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        post_body.add("자바 너무 재밌어요!!");
        post_view.add(0);

        postCount++;
        post_number.add(postCount);
        post_title.add("자바 질문좀 할게요~");
        post_body.add("qqq");
        post_view.add(0);

        postCount++;
        post_number.add(postCount);
        post_title.add("정처기 따야되나요?");
        post_body.add("ggg");
        post_view.add(0);

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
                System.out.println("게시물이 등록되었습니다.");

                postCount++;
                post_number.add(postCount);
                post_title.add(title);
                post_body.add(body);
                post_view.add(0);

            } else if (cmd.equals("list")) {
                System.out.println("==================");

                for (int i = 0; i < post_title.size(); i++) {
                    System.out.println("번호 : " + post_number.get(i));
                    System.out.println("제목 : " + post_title.get(i));
                    System.out.println("==================");
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int number = Integer.parseInt(scanner.nextLine());
                int index = post_number.indexOf(number);

                if (number > post_title.size() || number <= 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("제목 : ");
                    String new_title = scanner.nextLine();
                    System.out.print("내용 : ");
                    String new_body = scanner.nextLine();
                    System.out.println(number + "번 게시물이 수정되었습니다.");

                    post_title.set(index, new_title);
                    post_body.set(index, new_body);
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int number = Integer.parseInt(scanner.nextLine());
                int index = post_number.indexOf(number);

                if (number > post_title.size() || number <= 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.println(number + "번 게시물이 삭제되었습니다.");

                    post_number.remove(index);
                    post_title.remove(index);
                    post_body.remove(index);
                    post_view.remove(index);
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호 : ");
                int number = Integer.parseInt(scanner.nextLine());
                int index = post_number.indexOf(number);

                if (number > post_title.size() || number <= 0) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    post_view.set(index, post_view.get(index) + 1);

                    System.out.println("===== " + post_number.get(index) + "번 게시물 =====");
                    System.out.println("번호 : " + post_number.get(index));
                    System.out.println("제목 : " + post_title.get(index));
                    System.out.println("내용 : " + post_body.get(index));
                    System.out.println("등록날짜 : " + formatedNow);
                    System.out.println("조회수 : " + post_view.get(index));
                    System.out.println("======================");

                    ArrayList<String> post_comment = new ArrayList<>();
                    ArrayList<String> post_comment_date = new ArrayList<>();

                    while (true) {
                        System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                        int dnum = Integer.parseInt(scanner.nextLine());

                        if (dnum == 1) { // 댓글 등록
                            System.out.print("댓글 내용 : ");
                            String comment = scanner.nextLine();
                            post_comment.add(comment);

                            String commentDate = formatter.format(Calendar.getInstance().getTime());
                            post_comment_date.add(commentDate);

                            System.out.println("댓글이 성공적으로 등록되었습니다.");
                            System.out.println("===== " + post_number.get(index) + "번 게시물 =====");
                            System.out.println("번호 : " + post_number.get(index));
                            System.out.println("제목 : " + post_title.get(index));
                            System.out.println("내용 : " + post_body.get(index));
                            System.out.println("등록날짜 : " + formatedNow);
                            System.out.println("조회수 : " + post_view.get(index));
                            System.out.println("======================");

                            System.out.println("======= 댓글 =======");
                            for (int i = 0; i < post_comment.size(); i++) {
                                System.out.println(post_comment.get(i));
                                System.out.println("댓글 작성일 : " + post_comment_date.get(i));
                                System.out.println("====================");
                            }
                        }
//                    else if (dnum == 2) { // 추천
//
//                    }
//                    else if (dnum == 3) { // 수정
//
//                    }
//                    else if (dnum == 4) { // 삭제
//
//                    }
                        else if (dnum == 5) { // 목록으로
                            System.out.println("상세보기 화면을 빠져나갑니다.");
                            break;
                        }
                    }
                }
            } else if (cmd.equals("signup")) {
                System.out.println("==== 회원가입을 진행합니다 ====");
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.nextLine();
                sign_id.add(id);

                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.nextLine();
                sign_pw.add(pw);

                System.out.print("닉네임을 입력해주세요 : ");
                String nickname = scanner.nextLine();
                sign_nickname.add(nickname);

                System.out.println("==== 회원가입이 완료되었습니다 ====");
            } else if (cmd.equals("login")) {
                System.out.print("아이디 : ");
                String login_id = scanner.nextLine();
                System.out.print("비밀번호 : ");
                String login_pw = scanner.nextLine();

                for (int i = 0; i < sign_id.size(); i++) {
                    if (sign_id.get(i).equals(login_id)) {
                        if (sign_pw.get(i).equals(login_pw)) {
                            System.out.println(sign_nickname.get(i) + "님 환영합니다!");
                            System.out.print("명령어를 입력해주세요[" + sign_id.get(i) + "(" + sign_nickname.get(i) + ")] : ");
                            String cmdInLogin = scanner.nextLine();
                            System.out.println("[게시물 목록]");
                        }
                    } else {
                        System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
                    }
                }

            }
        }
    }
}