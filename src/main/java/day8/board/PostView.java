package day8.board;

public class PostView {
    public void displayPostDetails(Post post) {
        System.out.println("===== " + post.getNumber() + "번 게시물 =====");
        System.out.println("번호 : " + post.getNumber());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getBody());
        System.out.println("등록날짜 : " + post.getDate());
        System.out.println("조회수 : " + post.getView());
        System.out.println("작성자 : " + post.getAuthor());
        System.out.println("좋아요 :  " + (post.getLike() > 0 ? "♥ " + post.getLike() : "♡ " + post.getLike()));
        System.out.println("======================");

        System.out.println("======= 댓글 =======");
        for (String comment : post.getComments()) {
            System.out.println(post.getComments());
            System.out.println("댓글 작성일 : " + post.getDate());
            System.out.println("====================");
        }
    }
}
