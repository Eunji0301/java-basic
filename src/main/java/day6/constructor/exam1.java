package day6.constructor;

public class exam1 {
    // 다음 클래스들을 생성자를 이용해 간단하게 값을 세팅해주세요.

    public static void main(String[] args) {
        Person2 p1 = new Person2(27,"홍길동"); // 사람이 태어납니다.
        Person2 p2 = new Person2(25,"홍길순"); // 사람이 태어납니다.

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.

        Car c1 = new Car("소나타","하얀색",100); // 자동차가 만들어집니다.
        Car c2 = new Car("모닝","검정색",70); // 자동차가 만들어집니다.

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.

        Cat cat1 = new Cat("아리","러시안블루",4); // 고양이가 태어납니다.
        Cat cat2 = new Cat("망고","샴",6); // 고양이가 태어납니다.

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow(); // 6살 샴 고양이 망고가 야옹하고 웁니다.

        Warrior w1 = new Warrior("이순신",20,10); // 전사가 태어납니다.
        Warrior w2 = new Warrior("강감찬",15,15); // 전사가 태어납니다.

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.
    }
}

class Person2{
    int age;
    String name;

//    public Person2(int ageParam, String nameParam) {
//        age = ageParam;
//        name = nameParam;
//        System.out.println("사람이 태어납니다.");
//    }
    public Person2(int age, String name) {
        this.age = age; // this는 메서드를 수행하는 객체를 의미한다.
        this. name = name;
    }

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }
}

class Car {
    String model;
    String color;
    int speed;

    public Car(String modelParam, String colorParam, int speedParam) {
        model = modelParam;
        color = colorParam;
        speed = speedParam;
        System.out.println("자동차가 만들어집니다.");
    }

    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);
    }
}

class Cat {
    String name;
    String kind;
    int age;

    public Cat(String nameParam, String kindParam, int ageParam) {
        name = nameParam;
        kind = kindParam;
        age = ageParam;
        System.out.println("고양이가 태어납니다.");
    }

    public void meow() {
        System.out.printf("%d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}

class Warrior {
    // 상태
    String name;
    int attack;
    int defense;

    public Warrior(String nameParam, int attackParam, int defenseParam) {
        name = nameParam;
        attack = attackParam;
        defense = defenseParam;
        System.out.println("전사가 태어납니다.");
    }

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙니다.\n", name, attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다.\n", name, defense);
    }
}