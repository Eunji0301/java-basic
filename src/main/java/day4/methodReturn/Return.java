package day4.methodReturn;

// 메서드는 값을 표현할 수도 있고 아닐 수도 있다.
public class Return {
    public static void main(String args[]) {

        // 메서드는 값을 리턴할 수 있는데 리턴값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차작업할 수 있기 때문이다.
        Test t1 = new Test();
//        t1.plus(10, 20); // 30

        // 10, 20 더한 값에서 2로 나누고 싶다.
        int a = t1.plus(10, 20) / 2;
        System.out.println(a);

        // 10, 20 더한 값에서 2배를 하고 싶다.
        int b = t1.plus(10, 20) * 2;
        System.out.println(b);

        System.out.println("=== 원의 넓이 구하기 ===");
        // 문제. Test에 원의 넓이 구하는 메서드 만들기
        Test Circle = new Test();
        // 원의 넓이 : 반지름 * 반지름 * 3.14

        // 반지름이 5인 원의 넓이 :
        double c = Circle.circleArea(5);
        System.out.println(c);

        // 반지름이 10인 원의 넓이 :
        double d = Circle.circleArea(10);
        System.out.println(d);

        // 반지름이 5인 원의 넓이를 3으로 나눈 값 :
        double e = Circle.circleArea(5) / 3;
        System.out.println(e);

        // 반지름이 10인 원의 넓이를 2배로 증가시킨 값:
        double f = Circle.circleArea(10) * 2;
        System.out.println(f);
    }
}