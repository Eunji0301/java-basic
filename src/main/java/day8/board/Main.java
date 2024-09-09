package day8.board;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PostController postController = new PostController();
    static UserController userController = new UserController();

    static User loggedInUser = null;

    public static void main(String[] args) {
        userController.signUp();
        loggedInUser = userController.login();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                postController.addPost(loggedInUser);
            } else if (cmd.equals("list")) {
                postController.listPosts();
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호를 입력해주세요 : ");
                int number = Integer.parseInt(scanner.nextLine());

                Post post = postController.getPostByNumber(number);

                if (post != null) {
                    postController.updatePost(post, loggedInUser);
                } else {
                    System.out.println("해당 게시물이 존재하지 않습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호를 입력해주세요 : ");
                int number = Integer.parseInt(scanner.nextLine());

                Post post = postController.getPostByNumber(number);

                if (post != null) {
                    postController.deletePost(post, loggedInUser);
                } else {
                    System.out.println("해당 게시물이 존재하지 않습니다.");
                }
            } else if (cmd.equals("detail")) {
                postController.detailPost(loggedInUser);
            } else if (cmd.equals("sort")) {
                postController.sortPost();
            } else if (cmd.equals("page")) {
                postController.paging();
            }
        }
    }
}