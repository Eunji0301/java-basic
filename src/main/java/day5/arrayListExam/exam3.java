package day5.arrayListExam;

import java.util.ArrayList;

public class exam3 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.age = 24;
        p1.name = "홍길동";

        Person2 p2 = new Person2();
        p2.age = 30;
        p2.name = "이순신";

        Person2 p3 = new Person2();
        p3.age = 41;
        p3.name = "을지문덕";

        Person2 p4 = new Person2();
        p4.age = 32;
        p4.name = "황진이";


        // 1. 네 사람을 ArrayList에 저장
        System.out.println("== 네 사람을 ArrayList에 저장 ==");
        ArrayList<Person2> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);

        // 2. 네 사람에게 자기소개 시키기
        System.out.println("== 네 사람에게 자기소개 시키기 ==");
//        p1.introduce();
//        p2.introduce();
//        p3.introduce();
//        p4.introduce();

        for (int i = 0; i < p.size(); i++) {
            p.get(i).introduce();
        }

        System.out.println("== 이순신 제거 ==");
        p.remove(1);
        for (int i = 0; i < p.size(); i++) {
            p.get(i).introduce();
        }

        // 3. 30대인 사람에게만 자기소개 시키기
        System.out.println("== 30대인 사람에게만 자기소개 시키기 ==");
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getAge() >= 30 && p.get(i).getAge() < 40) {
                p.get(i).introduce();
            }
        }



        // 2개 이상의 데이터로 표현되는 개념/사물은 무조건 객체로 만들어라
    }
}

class Person2 {
    int age;
    String name;

    public void introduce() {
        System.out.println("저는 " + age + "살 " + name + "입니다.");
    }

    public int getAge(){
        return age;
    }

}