package day3;
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.

public class exam1 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        car1.run();
        car1.run();
        car1.run();

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car2 car2 = new Car2();
        car2.run();

        Car2 car3 = new Car2();
        car3.run();

        Car2 car4 = new Car2();
        car4.run();

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}

class Car2{
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
