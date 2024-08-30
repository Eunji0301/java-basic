package day6.constructor;

public class Constructor {
    public static void main() {
        Person p1 = new Person("홍길동",20);
        p1.introduce();

        // 객체를 만들고 나서 변수를 잘 세팅해야한다.
        // 그렇지 않으면 객체는 제대로 동작하지 않는다.
        // 객체 변수 세팅은 필수
        // 사람은 실수로 위와 같은 필수 작업을 누락할 수도 있다.
        // 객체가 만들어질 때 반드시 실행하는 코드를 세팅할 수 있다. -> 생성자
        Person p2 = new Person("임꺽정",31);
        p2.introduce();

        Person p3 = new Person("이순신",48);
        p3.introduce();

        Person p4 = new Person("황진이",53);
        p4.introduce();
    }
}