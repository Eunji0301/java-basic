package day1;

public class Variable {
    public static void main(String args[]) {
        // 변수를 사용해서 값을 저장할 수 있다.

        // 변수는 상자
        // 상자는 이름이 있어야 함.
        // 상자는 크기와 모양이 있어야 함.

        // 숫자
        // 상자(변수)를 만들어야 함.
        int age;

        // 값을 변수에 담아야 함.
        // =을 이용해서 저장 가능
        age = 20;

        // 문자
        String name;
        name = "홍길동";

        // 변수의 값을 꺼내서 사용
        System.out.println(age);
        System.out.println(name);

        // 안녕하세요 저는 20살 홍길동입니다. 10번 출력.
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");

        // 홍길동의 나이가 21살이 되었다. 21살로 바꿔서 10번 출력.
        age = 21;
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");

        // 홍길동이 홍길만으로 개명. 바뀐 이름 적용해서 10번 출력
        name = "홍길만";
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");

        // 변수 사용 시 주의사항
        // 동일한 이름의 변수가 2개 이상 존재할 수 없다.
        // 변수명이 숫자나 특수기호로 시작해서는 안된다. 숫자에 한해서 뒤쪽에 붙이는 것은 가능.
        // int 1aa = 10;, int !aa = 30;
        // 변수는 재활용 가능

        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        // 변수는 = 기준 왼쪽, 저장할 값은 오른쪽
    }
}
