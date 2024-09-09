package day8.board;

import java.util.ArrayList;
import java.util.List;

public class Post {
    int number;

    String title;
    String body;
    String author;
    String date;
    int view;
    int like;
    private List<String> comments;

    Post(int number, String title, String body, String author, String date) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.author = author;
        this.date = date;

        this.view = 0;
        this.like = 0;
        this.comments = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<String> getComments() {
        return comments;
    }

    public void toggleLike(User user) {
        if (like == 0) {
            this.like++;
            System.out.println("해당 게시물을 좋아합니다.");

        } else {
            this.like--;
            System.out.println("해당 게시물의 좋아요를 해제합니다.");
        }
    }

    public void addComment(String content, String date) {
        comments.add(content + date);
    }
}