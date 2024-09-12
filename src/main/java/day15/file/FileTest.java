package day15.file;

public class FileTest {
    public static void main(String[] args) {
        // 자바의 대부분의 정보는 객체라는 형태로 구조화(얼려져)되어있다.
        // 파일은 기본적으로 텍스트로 저장된다.
        // 자바의 객체를 바로 텍스트로 저장 불가능
        // 자바의 객체를 먼저 텍스트(문자)화 시켜야함. => 직렬화(Serializable)
        // 텍스트를 불러와서 자바의 객체 형태로 만드는 것 => 역직렬화(Deserializable)

        // 객체 직렬화 -> jackson 라이브러리를 이용해 객체를 json 문자화하기
        Post p1 = new Post(1, "Hello World", "This is a test post", "20240912", 0);
        Member m1 = new Member("hong123","h1234","홍길동");

        FileUtil fu = new FileUtil();
        JsonUtil ju = new JsonUtil();

        // 1. Post 객체를 JSON으로 직렬화하여 파일에 저장
        String jsonString = ju.toJsonString(p1); // p1 객체를 json 문자열로 직렬화
        fu.save(jsonString, "test.json"); // 직렬화된 p1을 test.json 파일에 저장

        String jsonString2 = ju.toJsonString2(m1);
        fu.save(jsonString2, "member.json");


        // 2. 저장된 파일을 읽어와 JSON 문자열로 변환
        String content = fu.load("test.json");

        String content2 = fu.load("member.json");

        // 3. JSON 문자열을 Post 객체로 역직렬화
        Post deserializedPost = ju.fromJsonString(content, Post.class);

        Member deserializedMember = ju.fromJsonString(content2, Member.class);

        // 4. 역직렬화된 객체에서 제목과 내용을 출력
        if (deserializedPost != null) {
            System.out.println("제목 : " + deserializedPost.getTitle());
            System.out.println("내용 : " + deserializedPost.getBody());
        } else {
            System.out.println("역직렬화에 실패했습니다.");
        }

        if (deserializedMember != null) {
            System.out.println("아이디 : " + deserializedMember.getLoginId());
            System.out.println("비밀번호 : " + deserializedMember.getLoginPw());
            System.out.println("닉네임 : " + deserializedMember.getNickname());
        } else {
            System.out.println("역직렬화에 실패했습니다.");
        }
    }
}

// 라이브러리 추가 방법
// 1. 원하는 라이브러리를 찾아서 다운로드
// 2. 얻은 라이브러리 파일을 내 프로젝트에 추가
// 3. 클래스나 메서드에서 import하여 사용