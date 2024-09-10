package day13;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Post {
    int number;
    String title;
    String body;
    int view;
    Date createdate;
    ArrayList<Comment> comments;

    public Post(int number, String title, String body) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.view = 0;
        this.createdate = new Date();
        this.comments = new ArrayList<>();
    }

    public void increaseView() {
        this.view++;
    }

    public String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return dateFormat.format(this.createdate);
    }

    public void addComment(String content) {
        String commentDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date());
        comments.add(new Comment(content, commentDate));
    }

    public void display() {
        System.out.println("===== " + number + "번 게시물 =====");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + body);
        System.out.println("작성일 : " + getFormattedDate());
        System.out.println("조회수 : " + view);
        System.out.println("======================");

        System.out.println("======== 댓글 ========");
        for (Comment comment : comments) {
            System.out.println("댓글 내용 : " + comment.content);
            System.out.println("댓글 작성일 : " + comment.commentdate);
            System.out.println("======================");
        }
    }
}