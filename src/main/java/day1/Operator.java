package day1;

public class Operator {
    public static void main(String args[]) {
        // 산술 연산자
        // +, -, *, /, %

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5); // 몫
        System.out.println(10 % 5); // 나머지

        System.out.println(10 / 3); // 정수
        System.out.println(10.0 / 3.0); // 실수
        System.out.println(10 % 3);

        // 비교 연산자
        // <, >, <=, >=, ==, !=
        System.out.println(10 > 5); // 맞음
        System.out.println(10 < 5); // 틀림

//        System.out.println(true); // 참이다
//        System.out.println("true"); // 알파벳 "t r u e"의 나열

        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println(!true);

        // 자료형(타입)
        // 숫자(정수) - int, 숫자(실수) - double, 문자 - String, 논리값(참/거짓) - boolean
    }
}
