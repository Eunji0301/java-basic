package day3;

public class exam6 {
    public static void main(String[] args) {

        Person4 p1 = new Person4();
        p1.age = 20;
        p1.name = "홍길동";
        p1.introduce();
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
    }
}

class Person4 {
    int age;
    String name;

    public void introduce() {
        for(int i = 0; i < 10; i++) {
            System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다.!");
        }
    }
}
