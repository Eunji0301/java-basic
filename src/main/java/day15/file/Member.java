package day15.file;

public class Member {
    String loginId;
    String loginPw;

    public String getNickname() {
        return nickname;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    String nickname;

    Member() {}

    public Member(String loginId, String loginPw, String nickname) {
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.nickname = nickname;
    }
}
