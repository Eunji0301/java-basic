package day3;

public class exam3 {
    public static void main(String[] args) {
        // 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.
        Person3 p = new Person3();
        // 안녕하세요!!
        p.hi();
        // 저는 차태진입니다.
        p.introduce();
        // 자바를 통해
        p.java();
        // 프로그램을 만들어보아요.
        p.program();
    }
}

class Person3 {
    public void hi() {
        System.out.println("안녕하세요 !!");
    }
    public void introduce() {
        System.out.println("저는 차태진입니다.");
    }
    public void java() {
        System.out.println("자바를 통해");
    }
    public void program() {
        System.out.println("프로그램을 만들어보아요.");
    }
}