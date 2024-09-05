package day8.board;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static Date now = Calendar.getInstance().getTime();
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    static String formatedNow = formatter.format(now);

    static ArrayList<Post> posts = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    static int postCount = 0;

    public static void main(String[] args) {

        initializePosts();
        User loggedInUser = signAndLogin();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                addPost(loggedInUser);
            } else if (cmd.equals("list")) {
                listPosts();
            } else if (cmd.equals("update")) {
                updatePost(loggedInUser);
            } else if (cmd.equals("delete")) {
                deletePost(loggedInUser);
            } else if (cmd.equals("detail")) {
                detailPost(loggedInUser);
            } else if (cmd.equals("sort")) {
                sortPost(loggedInUser);
            }
        }
    }

    private static User signAndLogin() {
        System.out.println("==== 회원가입을 진행합니다 ====");
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.nextLine();

        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = scanner.nextLine();

        System.out.print("닉네임을 입력해주세요 : ");
        String nickname = scanner.nextLine();

        users.add(new User(id, pw, nickname));
        System.out.println("==== 회원가입이 완료되었습니다 ====");

        System.out.print("아이디 : ");
        String login_id = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String login_pw = scanner.nextLine();

        User loggedInUser = null;

        for (User user : users) {
            if (user.id.equals(login_id) && user.pw.equals(login_pw)) {
                System.out.println(user.nickname + "님 환영합니다!");
                return user;
            }
        }

        System.out.println("비밀번호가 틀렸거나 잘못된 회원정보입니다.");
        return null;
    }

    private static void initializePosts() {
        posts.add(new Post(++postCount, "안녕하세요 반갑습니다. 자바 공부중이에요.", "자바 너무 재밌어요!!", "홍길동", formatter.format(Calendar.getInstance().getTime())));
        posts.add(new Post(++postCount, "자바 질문좀 할게요~", "자바에서 배열과 리스트의 차이가 뭔가요?", "이순신", formatter.format(Calendar.getInstance().getTime())));
        posts.add(new Post(++postCount, "정처기 따야되나요?", "정처기 자격증이 취업에 얼마나 도움이 될까요?", "임꺽정", formatter.format(Calendar.getInstance().getTime())));
    }

    private static void sortPost(User loggedInUser) {
        System.out.print("정렬대상을 선택해주세요 : (1. 번호, 2. 조회수) : ");
        int sortTarget = Integer.parseInt(scanner.nextLine());
        System.out.println("정렬 방법을 선택해주세요 : (1. 오름차순, 2. 내림차순) : ");
        int sortHow = Integer.parseInt(scanner.nextLine());

        if (sortTarget == 1) {
            if (sortHow == 1) {
                posts.sort(Comparator.comparingInt(post -> post.number));
            } else if (sortHow == 2) {
                posts.sort((post1, post2) -> post2.number - post1.number);
            }
        } else if (sortTarget == 2) {
            if (sortHow == 1) {
                posts.sort(Comparator.comparingInt(post -> post.view));
            } else if (sortHow == 2) {
                posts.sort((post1, post2) -> post2.number - post1.number);
            }
        }


    }

    private static void detailPost(User loggedInUser) {
        System.out.print("상세보기 할 게시물 번호 : ");
        int number = Integer.parseInt(scanner.nextLine());
        Post post = getPostByNumber(posts, number);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            post.view++;
            post.display();

            while (true) {
                System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                int dnum = Integer.parseInt(scanner.nextLine());

                if (dnum == 1) { // 댓글 등록
                    System.out.print("댓글 내용 : ");
                    String comment = scanner.nextLine();
                    String commentDate = formatter.format(Calendar.getInstance().getTime());
                    post.addComment(comment, commentDate);

                    System.out.println("댓글이 성공적으로 등록되었습니다.");
                    post.display();
                } else if (dnum == 2) {// 좋아요
                    post.toggleLike(loggedInUser);
                    post.display();
                } else if (dnum == 3) { // 수정
                    if (post.author.equals(loggedInUser.nickname)) {
                        System.out.print("제목 : ");
                        String new_title = scanner.nextLine();
                        System.out.print("내용 : ");
                        String new_body = scanner.nextLine();

                        post.title = new_title;
                        post.body = new_body;

                        post.display();
                    } else {
                        System.out.println("자신의 게시물만 수정할 수 있습니다.");
                    }
                } else if (dnum == 4) { // 삭제
                    if (post.author.equals(loggedInUser.nickname)) {
                        System.out.print("정말 게시물을 삭제하시겠습니까?(y/n) : ");
                        String confirm = scanner.nextLine();

                        if (confirm.equals("y")) {
                            posts.remove(post);
                            System.out.println(loggedInUser.nickname + "님의 " + number + "번 게시물을 삭제했습니다.");
                            break;
                        }
                    } else {
                        System.out.println("자신의 게시물만 삭제할 수 있습니다.");
                    }
                } else if (dnum == 5) { // 목록으로
                    System.out.println("상세보기 화면을 빠져나갑니다.");
                    break;
                }
            }
        }
    }

    private static void deletePost(User loggedInUser) {
        System.out.print("삭제할 게시물 번호 : ");
        int number = Integer.parseInt(scanner.nextLine());
        Post post = getPostByNumber(posts, number);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else if (!post.author.equals(loggedInUser.nickname)) {
            System.out.println("자신의 게시물만 삭제할 수 있습니다.");
        } else {
            posts.remove(post);
            System.out.println(number + "번 게시물이 삭제되었습니다.");
        }
    }

    private static void updatePost(User loggedInUser) {
        System.out.print("수정할 게시물 번호 : ");
        int number = Integer.parseInt(scanner.nextLine());
        Post post = getPostByNumber(posts, number);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else if (!post.author.equals(loggedInUser.nickname)) {
            System.out.println("자신의 게시물만 수정할 수 있습니다.");
        } else {
            System.out.print("제목 : ");
            String new_title = scanner.nextLine();
            System.out.print("내용 : ");
            String new_body = scanner.nextLine();
            System.out.println(number + "번 게시물이 수정되었습니다.");

            post.title = new_title;
            post.body = new_body;
        }
    }

    private static void listPosts() {
        System.out.println("==================");
        for (Post post : posts) {
            System.out.println("번호 : " + post.number);
            System.out.println("제목 : " + post.title);
            System.out.println("==================");
        }
    }

    private static void addPost(User loggedInUser) {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scanner.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = scanner.nextLine();

        posts.add(new Post(++postCount, title, body, "작성자", formatter.format(new Date())));
        System.out.println("게시물이 등록되었습니다.");
    }

    static Post getPostByNumber(ArrayList<Post> posts, int number) {
        for (Post post : posts) {
            if (post.number == number) {
                return post;
            }
        }
        return null;
    }
}