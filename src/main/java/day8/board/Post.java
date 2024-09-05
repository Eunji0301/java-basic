package day8.board;

import java.util.ArrayList;

public class Post {
    int number;
    String title;
    String body;
    String author;
    String date;
    int view;
    int like;
    ArrayList<Comment> comments;
    ArrayList<String> likedUsers;

    Post(int number, String title, String body, String author, String date) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.author = author;
        this.date = date;

        this.view = 0;
        this.like = 0;
        this.comments = new ArrayList<>();
        this.likedUsers = new ArrayList<>();
    }

    public void toggleLike(User user) {
        if (likedUsers.contains(user.nickname)) {
            likedUsers.remove(user.nickname);
            this.like--;
            System.out.println("해당 게시물의 좋아요를 해제합니다.");
        } else {
            likedUsers.add(user.nickname);
            this.like++;
            System.out.println("해당 게시물을 좋아합니다.");
        }
    }

    public void display() {
        System.out.println("===== " + number + "번 게시물 =====");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + body);
        System.out.println("등록날짜 : " + date);
        System.out.println("조회수 : " + view);
        System.out.println("작성자 : " + author);
        System.out.println("좋아요 :  " + (like > 0 ? "♥ " + like : "♡ " + like));
        System.out.println("======================");

        System.out.println("======= 댓글 =======");
        for (Comment comment : comments) {
            System.out.println(comment.content);
            System.out.println("댓글 작성일 : " + comment.date);
            System.out.println("====================");
        }
    }

    public void addComment(String content, String date) {
        comments.add(new Comment(content, date));
    }
}