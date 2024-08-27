package day3;

public class exam8 {
    public static void main(String[] args) {
        Person6 p1 = new Person6();
        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        p1.greeting1(2);
        // 하이~

        p1.greeting1(3);
        // 봉쥬

        p1.greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        p1.greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        p1.greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        p1.greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }
}

class Person6 {
    public void greeting1(int language) {
        if(language == 1) {
            System.out.println("안녕하세요");
        }
        else if(language == 2) {
            System.out.println("하이~");
        }
        else if(language == 3) {
            System.out.println("봉쥬");
        }
    }
    public void greeting2(int language, int count) {
        for(int i = 0; i < count; i++) {
            if(language == 1) {
                System.out.println("안녕하세요");
            }
            else if(language == 2) {
                System.out.println("하이~");
            }
            else if(language == 3) {
                System.out.println("봉쥬");
            }
        }
    }
}