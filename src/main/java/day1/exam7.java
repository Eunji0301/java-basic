package day1;
/*
어떤 차의 높이가 170cm 입니다..

이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
*/
public class exam7 {
    public static void main(String args[]) {
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;

        int car = 176;

        if (tunnel1 > car && tunnel2 > car && tunnel3 > car) {
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
    }
}