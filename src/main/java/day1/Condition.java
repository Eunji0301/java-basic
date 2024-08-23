package day1;

public class Condition {
    public static void main(String args[]) {
        // 조건
        // if 소괄호 중괄호
        if(false) {
            System.out.println("안녕");
        }

        int num = 15;
        if (num > 10) {
            System.out.println("num이 10보다 크다.");
        }

        int money = 10000;
        // 10000원 이상 : 치킨
        // 10000원 미만 : 떡볶이
        if(money >= 10000) {
            System.out.println("치킨을 먹어요!");
        }
        if(money < 10000) {
            System.out.println("떡볶이를 먹어요");
        }

        // 맑음(1) : 날씨가 맑습니다. 나들이 나가세요.
        // 흐림(2) : 날씨가 흐립니다. 집에 계세요.
        // 비(3) : 날씨가 비가 옵니다. 우산을 챙기세요.
        // 눈(4) : 날씨가 눈이 옵니다. 눈사람을 만들어보세요.

        int weather;
        weather = 1;

        if (weather == 1) {
            System.out.println("날씨가 맑습니다. 나들이 나가세요.");
        }
        if (weather == 2) {
            System.out.println("날씨가 흐립니다. 집에 계세요.");
        }
        if (weather == 3) {
            System.out.println("날씨가 비가 옵니다. 우산을 챙기세요.");
        }
        if (weather == 4) {
            System.out.println("날씨가 눈이 옵니다. 눈사람을 만들어보세요.");
        }
    }
}