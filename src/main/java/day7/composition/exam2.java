package day7.composition;

public class exam2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 20;
        a사람.a왼팔 = new 팔(); // a왼팔은 원시타입이 아닌 객체타입

        System.out.println(a사람.a왼팔.길이 + "cm"); // 객체 안에 객체가 있을 수 있다 => Composition
        // 출력 : 100cm

        // 객체가 가지고 있는 변수, 메서드
    }
}

class 사람 {
    int 나이;
    팔 a왼팔;
}

class 팔 {
    int 길이 = 100;
}
