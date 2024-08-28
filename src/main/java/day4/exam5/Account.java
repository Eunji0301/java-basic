package day4.exam5;

public class Account {
    int sum = 0;
    int withdraw = 0;

    public int deposit(int d) {
        System.out.println(d + "원을 예금했습니다.");
        return sum += d;
    }

    public int withdraw(int w) {
        withdraw = w;
        return withdraw;
    }

    public int getRemainder() {
        sum = sum - withdraw;
        return sum;
    }
}