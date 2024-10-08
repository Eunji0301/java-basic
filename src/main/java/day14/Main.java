package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static User loggedInUser = null;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Post> posts = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static int postCount = 0;

    public static void main(String[] args) {
        users.add(new User("hong123", "h1234", "홍길동"));
        users.add(new User("l123", "l1234", "이순신"));
        users.add(new User("y123", "y1234", "임꺽정"));

        inputTestData();

        // try - catch를 최대한 사용하지 않는게 좋다.
        // 몇가지 상황을 제외하고는 try- catch 사용하지 않고 if문으로 처리 다 가능
        while (true) {
            try {
                if (loggedInUser == null) {
                    System.out.print("명령어 : ");
                } else {
                    System.out.print("명령어[" + loggedInUser.id + "(" + loggedInUser.nickname + ")] : ");
                }

                String cmd = scanner.nextLine();

                if (cmd.equals("exit")) {
                    break;
                } else if (cmd.equals("add")) {
                    System.out.print("게시물 제목을 입력해주세요 : ");
                    String title = scanner.nextLine();
                    System.out.print("게시물 내용을 입력해주세요 : ");
                    String body = scanner.nextLine();

                    posts.add(new Post(++postCount, title, body, loggedInUser));
                    System.out.println("게시물이 등록되었습니다.");

                } else if (cmd.equals("list")) {
                    System.out.println("==================");
                    for (Post post : posts) {
                        System.out.println("번호 : " + post.number);
                        System.out.println("제목 : " + post.title);
                        System.out.println("==================");
                    }
                } else if (cmd.equals("update")) {

                    System.out.print("수정할 게시물 번호 : ");
                    int num = getValidPostNumber();
                    Post post = findPostByNumber(posts, num);

                    if (post != null) {
                        System.out.print("제목 : ");
                        String new_title = scanner.nextLine();
                        System.out.print("내용 : ");
                        String new_body = scanner.nextLine();

                        post.title = new_title;
                        post.body = new_body;
                        System.out.println(num + "번 게시물이 수정되었습니다.");
                    } else {
                        System.out.println("없는 게시물 번호입니다.");
                    }
                } else if (cmd.equals("delete")) {
                    System.out.print("삭제할 게시물 번호 : ");
                    int num = getValidPostNumber();
                    Post post = findPostByNumber(posts, num);

                    if (post != null) {
                        posts.remove(post);
                        System.out.println(num + "번 게시물이 삭제되었습니다.");
                    } else {
                        System.out.println("없는 게시물 번호입니다.");
                    }
                } else if (cmd.equals("detail")) {
                    System.out.print("상세보기 할 게시물 번호 : ");
                    int num = getValidPostNumber();
                    Post post = findPostByNumber(posts, num);

                    if (post != null) {
                        post.increaseView();
                        System.out.println("===== " + post.number + "번 게시물 =====");
                        System.out.println("번호 : " + post.number);
                        System.out.println("제목 : " + post.title);
                        System.out.println("내용 : " + post.body);
                        System.out.println("등록날짜 : " + post.getFormattedDate());
                        System.out.println("조회수 : " + post.view);
                        System.out.println("작성자 : " + post.author.nickname);
                        System.out.println("좋아요 : " + (post.like > 0 ? "♥ " + post.like : "♡ " + post.like));
                        System.out.println("==================");

                        while (true) {
                            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                            int dnum = Integer.parseInt(scanner.nextLine());

                            if (dnum == 1) { // 댓글 등록
                                System.out.print("댓글 내용 : ");
                                String content = scanner.nextLine();
                                post.addComment(content);
                                System.out.println("댓글이 성공적으로 등록되었습니다.");
                                post.display();
                            } else if (dnum == 2) { // 추천
                                post.toggleLike(loggedInUser);
                                post.display();
                            } else if (dnum == 3) { // 수정
                                if (post.author.equals(loggedInUser)) {
                                    System.out.print("제목 : ");
                                    String new_title = scanner.nextLine();
                                    System.out.print("내용 : ");
                                    String new_body = scanner.nextLine();

                                    post.title = new_title;
                                    post.body = new_body;

                                    System.out.println("===== " + post.number + "번 게시물 =====");
                                    System.out.println("번호 : " + post.number);
                                    System.out.println("제목 : " + post.title);
                                    System.out.println("내용 : " + post.body);
                                    System.out.println("등록날짜 : " + post.getFormattedDate());
                                    System.out.println("조회수 : " + post.view);
                                    System.out.println("작성자 : " + post.author.nickname);
                                    System.out.println("좋아요 : " + (post.like > 0 ? "♥ " + post.like : "♡ " + post.like));
                                    System.out.println("==================");
                                } else {
                                    System.out.println("자신의 게시물만 수정할 수 있습니다.");
                                }
                            } else if (dnum == 4) {
                                if (post.author.equals(loggedInUser)) {
                                    System.out.print("정말 게시물을 삭제하시겠습니까?(y/n) : ");
                                    String really = scanner.nextLine();

                                    if (really.equals("y")) {
                                        posts.remove(post);
                                        System.out.println(loggedInUser.nickname + "님의 " + post.number + "번 게시물을 삭제했습니다.");
                                        break;
                                    }
                                } else {
                                    System.out.println("자신의 게시물만 삭제할 수 있습니다.");
                                }
                            } else if (dnum == 5) {
                                System.out.println("상세보기 화면을 빠져나갑니다.");
                                break;
                            }
                        }
                    } else {
                        System.out.println("없는 게시물 번호입니다.");
                    }
                } else if (cmd.equals("search")) {
                    System.out.print("검색 키워드를 입력해주세요 : ");
                    String keyword = scanner.nextLine();
                    boolean found = false;

                    for (Post post : posts) {
                        if (post.title.contains(keyword)) {
                            System.out.println("==================");
                            System.out.println("번호 : " + post.number);
                            System.out.println("제목 : " + post.title);
                            System.out.println("==================");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("==================");
                        System.out.println("검색 결과가 없습니다.");
                        System.out.println("==================");
                    }
                } else if (cmd.equals("signup")) {
                    System.out.println("===== 회원가입을 진행합니다. =====");
                    System.out.print("아이디를 입력해주세요 : ");
                    String id = scanner.nextLine();

                    System.out.print("비밀번호를 입력해주세요 : ");
                    String pw = scanner.nextLine();

                    System.out.print("닉네임을 입력해주세요 : ");
                    String nickname = scanner.nextLine();

                    users.add(new User(id, pw, nickname));

                    System.out.println();
                    System.out.println("===== 회원가입이 완료되었습니다. =====");
                } else if (cmd.equals("login")) {
                    System.out.print("아이디 : ");
                    String id = scanner.nextLine();
                    System.out.print("비밀번호 : ");
                    String pw = scanner.nextLine();

                    boolean isAuthenticated = false;
                    for (User user : users) {
                        if (user.id.equals(id) && user.pw.equals(pw)) {
                            loggedInUser = user;
                            System.out.println(loggedInUser.nickname + "님 환영합니다!");
                            isAuthenticated = true;
                            break;
                        }
                    }

                    if (!isAuthenticated) {
                        System.out.println("비밀번호가 틀렸거나 잘못된 회원정보입니다.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력형식입니다. 숫자를 입력해주세요.");
            } catch (NullPointerException e) {
                System.out.println("존재하지 않는 데이터입니다.");
            } catch (Exception e) {
                System.out.println("알 수 없는 오류가 발생했습니다 : " + e.getMessage());
            }

        }
    }

    private static int getValidPostNumber() {
        int num = -1;
        try {
            num = Integer.getInteger(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("잘못된 번호입니다. 숫자를 입력해주세요.");
        }
        return num;
    }

    private static void inputTestData() {
        posts.add(new Post(++postCount, "안녕하세요 반갑습니다. 자바 공부중이에요.", "AAA", users.get(0)));
        posts.add(new Post(++postCount, "자바 질문좀 할게요~", "BBB", users.get(1)));
        posts.add(new Post(++postCount, "정처기 따야되나요?", "CCC", users.get(2)));
    }

    public static Post findPostByNumber(ArrayList<Post> posts, int num) {
        for (Post post : posts) {
            if (post.number == num) {
                return post;
            }
        }
        return null;
    }
}