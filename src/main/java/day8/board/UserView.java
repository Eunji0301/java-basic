package day8.board;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);

    User signUp() {
        System.out.println("==== 회원가입을 진행합니다 ====");
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.nextLine();

        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = scanner.nextLine();

        System.out.print("닉네임을 입력해주세요 : ");
        String nickname = scanner.nextLine();

        System.out.println("==== 회원가입이 완료되었습니다 ====");
        return new User(id, pw, nickname);
    }

    User login(ArrayList<User> users) {
        System.out.print("아이디 : ");
        String login_id = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String login_pw = scanner.nextLine();

        for (User user : users) {
            if (user.getId().equals(login_id) && user.getPw().equals(login_pw)) {
                System.out.println(user.getNickname() + "님 환영합니다!");
                return user;
            }
        }

        System.out.println("비밀번호가 틀렸거나 잘못된 회원정보입니다.");
        return null;
    }
}
