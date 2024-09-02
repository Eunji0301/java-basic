package day7.inheritance.constructorChain;

// 상속은 부모객체를 만들고 자식객체가 그 위에 만들어진다.
// 동일한 이름을 가진 자원은 자기 자신 것을 우선으로 사용
// -> 객체는 자기자신의 메서드를 우선적으로 사용

// 상속 : 부모클래스 - 자식클래스 / 부모객체 - 자식객체 /

public class ConstructorChain {
    public static void main(String[] args) {
        WhiteDuck wd = new WhiteDuck();
        wd.fly();
    }
}

class Duck {
    public Duck() {
        System.out.println("Duck이 생성됩니다.");
    }
    public void fly() {
        System.out.println("오리가 납니다.");
    }
}

class WhiteDuck extends Duck {
    public WhiteDuck() {
        System.out.println("WhiteDuck이 생성됩니다.");
    }

    public void fly() {
        System.out.println("흰오리가 납니다.");
    }
}