package day4.instanceVar;

public class InstanceVar {
    public static void main(String args[]) {
        // 매개변수를 이용해 동작을 다채롭게
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.intro();

        Person p2 = new Person();
        p2.name = "이순신";
        p2.intro();

        p1.walk();
        p2.walk();
    }
}
