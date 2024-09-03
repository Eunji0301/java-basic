package day8.staticExam;

public class Person {
    int age;
    String name;
    static int averageAge; // 인류 평균나이 : 80

    // 생성자는 객체를 만들 때 사용하기 때문에 객체를 만들지 않아도 사용 가능한 static 변수는 static 초기화를 따로 해준다.
    static {
        averageAge = 80;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void introduce() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }

    public static void printaverageAge() {
        System.out.println("인류 평균 나이는 " + averageAge + "살입니다.");
    }

    public static void walk() {
        System.out.println("걸어다닙니다.");
    }
}