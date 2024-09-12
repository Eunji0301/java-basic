package day14;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    int number;
    String title;
    String body;
    Date createDate;
    int view;
    ArrayList<Comment> comments;
    User author;
    int like;
    ArrayList<String> likedUsers;

    public Post(int number, String title, String body, User author) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.createDate = new Date();
        this.view = 0;
        this.comments = new ArrayList<>();
        this.author = author;
        this.like = 0;
        this.likedUsers = new ArrayList<>();
    }

    public String getFormattedDate() {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return dateformat.format(this.createDate);
    }

    public void increaseView() {
        this.view++;
    }

    public void addComment(String content) {
        String commentDate = new SimpleDateFormat("yyy.MM.dd HH:mm:ss").format(new Date());
        comments.add(new Comment(content, commentDate));
    }

    public void display() {
        System.out.println("===== " + number + "번 게시물 =====");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + body);
        System.out.println("작성일 : " + getFormattedDate());
        System.out.println("조회수 : " + view);
        System.out.println("작성자 : " + author.nickname);
        System.out.println("좋아요 : " + (like > 0 ? "♥ " + like : "♡ " + like));
        System.out.println("==================");


        for (Comment comment : comments) {
            System.out.println("===== 댓글 =====");
            System.out.println("댓글 내용 : " + comment.content);
            System.out.println("댓글 작성일 : " + comment.commentDate);
            System.out.println("================");
        }
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
}
