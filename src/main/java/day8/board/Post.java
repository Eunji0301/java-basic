package day8.board;

import java.util.ArrayList;

public class Post {
    int number;
    String title;
    String body;
    String author;
    String date;
    int view;
    ArrayList<Comment> comments;

    public Post(int number, String title, String body, String author, String date) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.author = author;
        this.date = date;

        this.view = 0;
        this.comments = new ArrayList<>();
    }

    void display() {
        System.out.println("===== " + number + "번 게시물 =====");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + body);
        System.out.println("등록날짜 : " + date);
        System.out.println("조회수 : " + view);
        System.out.println("======================");

        System.out.println("======= 댓글 =======");
        for (Comment comment : comments) {
            System.out.println(comment.content);
            System.out.println("댓글 작성일 : " + comment.date);
            System.out.println("====================");
        }
    }

    void addComment(String content, String date) {
        comments.add(new Comment(content,date));
    }
}