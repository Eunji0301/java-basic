package day4.instanceVar;

public class Person {

    // 두 개 이상의 메서드가 공유해야하는 변수
    // 인스턴스변수는 인스턴스가 제거될 때 같이 사라진다.
    // 인스턴스는 리모콘을 잃어버리면 사라진다.
    String name;

    // 메서드 안에서 만들어지는 변수는 -> 지역변수

    // 지역변수는 메서드(함수)가 종료되면 사라진다.
    public void intro() {
        System.out.println("안녕하세요 저는 " + name + "입니다.");
    }

    public void walk() {
        System.out.println(name + "이 걷습니다.");
    }
}
