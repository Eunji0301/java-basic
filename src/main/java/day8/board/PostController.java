package day8.board;

import java.text.SimpleDateFormat;
import java.util.*;

public class PostController {
    static List<Post> posts = new ArrayList<>();
    private PostView postView = new PostView();
    private static Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    private int postCount = 0;
    static int currentPage = 1; // 최근 페이지
    static int postsPerPage = 3; // 한페이지당 3 게시물
    static int pageDisplayLimit = 5;// 페이지 개수 많을 때 한 블록에 최대 5개 페이지


    public PostController() {
        initializePosts();
    }

    public void initializePosts() {
        posts.add(new Post(++postCount, "안녕하세요 반갑습니다. 자바 공부중이에요.", "자바 너무 재밌어요!!", "홍길동", formatter.format(Calendar.getInstance().getTime())));
        posts.add(new Post(++postCount, "자바 질문좀 할게요~", "자바에서 배열과 리스트의 차이가 뭔가요?", "이순신", formatter.format(Calendar.getInstance().getTime())));
        posts.add(new Post(++postCount, "정처기 따야되나요?", "정처기 자격증이 취업에 얼마나 도움이 될까요?", "임꺽정", formatter.format(Calendar.getInstance().getTime())));
    }

    public void addPost(User loggedInUser) {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scanner.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = scanner.nextLine();

        posts.add(new Post(++postCount, title, body, loggedInUser.getNickname(), formatter.format(new Date())));
        System.out.println("게시물이 등록되었습니다.");
    }

    public void detailPost(User loggedInUser) {
        System.out.print("상세보기 할 게시물 번호 : ");
        int number = Integer.parseInt(scanner.nextLine());
        Post post = getPostByNumber(number);

        if (post != null) {
            post.setView(post.getView() + 1);
            postView.displayPostDetails(post);

            while (true) {
                System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                int dnum = Integer.parseInt(scanner.nextLine());

                if (dnum == 1) { // 댓글 등록
                    addComment(post);
                } else if (dnum == 2) {// 좋아요
                    post.toggleLike(loggedInUser);
                } else if (dnum == 3) { // 수정
                    updatePost(post, loggedInUser);
                } else if (dnum == 4) { // 삭제
                    deletePost(post, loggedInUser);
                } else if (dnum == 5) { // 목록으로
                    System.out.println("상세보기 화면을 빠져나갑니다.");
                    break;
                }
            }
        } else {
            System.out.println("없는 게시물 번호입니다.");
        }
    }

    public void addComment(Post post) {
        System.out.print("댓글 내용 : ");
        String comment = scanner.nextLine();
        String commentDate = formatter.format(Calendar.getInstance().getTime());
        post.addComment(comment, commentDate);

        System.out.println("댓글이 성공적으로 등록되었습니다.");
        postView.displayPostDetails(post);
    }

    public void updatePost(Post post, User loggedInUser) {
        if (post.getAuthor().equals(loggedInUser.getNickname())) {
            System.out.print("제목 : ");
            String new_title = scanner.nextLine();
            System.out.print("내용 : ");
            String new_body = scanner.nextLine();

            post.setTitle(new_title);
            post.setBody(new_body);

            postView.displayPostDetails(post);
        } else {
            System.out.println("자신의 게시물만 수정할 수 있습니다.");
        }
    }

    public void deletePost(Post post, User loggedInUser) {
        if (post.getAuthor().equals(loggedInUser.getNickname())) {
            System.out.print("정말 게시물을 삭제하시겠습니까?(y/n) : ");
            String confirm = scanner.nextLine();

            if (confirm.equals("y")) {
                posts.remove(post);
                System.out.println(loggedInUser.getNickname() + "님의 " + post.getNumber() + "번 게시물을 삭제했습니다.");
            }
        } else {
            System.out.println("자신의 게시물만 삭제할 수 있습니다.");
        }
    }

    public static void sortPost() {
        System.out.print("정렬대상을 선택해주세요 : (1. 번호, 2. 조회수) : ");
        int sortTarget = Integer.parseInt(scanner.nextLine());
        System.out.print("정렬 방법을 선택해주세요 : (1. 오름차순, 2. 내림차순) : ");
        int sortHow = Integer.parseInt(scanner.nextLine());

        Comparator<Post> comparator;

        if (sortTarget == 1) {
            comparator = Comparator.comparingInt(Post::getNumber);
        } else {
            comparator = Comparator.comparingInt(Post::getView);
        }

        if (sortHow == 2) {
            comparator = comparator.reversed();
        }

        posts.sort(comparator);
        listPosts();
    }

    public static void paging() {
        while (true) {
            int totalPages = (int) Math.ceil((double) posts.size() / postsPerPage);
            showPostsOnPage(currentPage);
            showPageNumbers(totalPages);

            System.out.print("페이징 명령어를 입력해주세요 (( 1. 이전, 2. 다음, 3. 선택, 4. 뒤로가기) : ");
            int pNum = Integer.parseInt(scanner.nextLine());

            if (pNum == 1) { // 이전
                if (currentPage > 1) {
                    currentPage--;
                } else {
                    System.out.println("첫 페이지입니다.");
                }
            } else if (pNum == 2) { // 다음
                if (currentPage < totalPages) {
                    currentPage++;
                } else {
                    System.out.println("마지막 페이지입니다.");
                }
            } else if (pNum == 3) { // 선택
                System.out.print("이동하실 페이지 번호를 입력해주세요 : ");
                int selectedPage = Integer.parseInt(scanner.nextLine());

                if (selectedPage >= 1 && selectedPage <= totalPages) {
                    currentPage = selectedPage;
                } else {
                    System.out.println("잘못된 페이지 번호입니다.");
                }
            } else if (pNum == 4) { // 뒤로가기
                break;
            }
        }
    }

    public static void showPostsOnPage(int page) {
        int start = (page - 1) * postsPerPage;
        int end = Math.min(start + postsPerPage, posts.size());

        for (int i = start; i < end; i++) {
            Post post = posts.get(i);
            System.out.println("================");
            System.out.println("번호 : " + post.number);
            System.out.println("제목 : " + post.title);
            System.out.println("작성자 : " + post.author);
            System.out.println("조회수 : " + post.view);
            System.out.println("좋아요 : " + post.like);
            System.out.println("================");
        }
    }

    public static void showPageNumbers(int totalPages) {
        int startPage = Math.max(1, currentPage - (pageDisplayLimit / 2));
        int endPage = Math.min(totalPages, startPage + pageDisplayLimit - 1);

        if (startPage > 1) {
            System.out.print("<< ");
        }

        for (int i = startPage; i <= endPage; i++) {
            if (i == currentPage) {
                System.out.print("[" + i + "] ");
            } else {
                System.out.print(i + " ");
            }
        }

        if (endPage < totalPages) {
            System.out.println(">>");
        }

        System.out.println();
    }

    static void listPosts() {
        System.out.println("==================");
        for (Post post : posts) {
            System.out.println("번호 : " + post.number);
            System.out.println("제목 : " + post.title);
            System.out.println("==================");
        }
    }

    static Post getPostByNumber(int number) {
        for (Post post : posts) {
            if (post.number == number) {
                return post;
            }
        }
        return null;
    }
}
