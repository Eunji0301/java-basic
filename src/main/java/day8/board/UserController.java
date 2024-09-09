package day8.board;

import java.util.ArrayList;

public class UserController {
    private ArrayList<User> users;
    private UserView userView;

    public UserController() {
        this.users = new ArrayList<>();
        this.userView = new UserView();
    }

    public User signUp() {
        User newUser = userView.signUp();
        users.add(newUser);
        System.out.println("회원가입이 완료되었습니다.");
        return newUser;
    }

    public User login() {
        return userView.login(users);
    }
}
