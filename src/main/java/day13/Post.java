package day13;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Post {
    int number;
    String title;
    String body;
    int view;
    Date createdate;

    public Post(int number, String title, String body) {
        this.number = number;
        this.title = title;
        this.body = body;
        this.view = 0;
        this.createdate = new Date();
    }

    public void increaseView() {
        this.view++;
    }

    public String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return dateFormat.format(this.createdate);
    }
}