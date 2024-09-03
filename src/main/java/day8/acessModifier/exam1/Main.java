package day8.acessModifier.exam1;
// 문제 : 값이 출력되게 해주세요.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.id = 20;

        System.out.println("제 번호는 " + p1.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}
