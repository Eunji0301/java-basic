package day8.board;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PostController postController = new PostController();

    public static void main(String[] args) {
        Post post = null;
        User loggedInUser = null;

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
                postController.updatePost(post, loggedInUser);
            } else if (cmd.equals("delete")) {
                postController.deletePost(post, loggedInUser);
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