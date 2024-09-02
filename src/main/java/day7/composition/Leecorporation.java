package day7.composition;

public class Leecorporation {
    public static void main(String[] args) {

        // Kildong이와 Kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록

        LeeCorp leeCorp = new LeeCorp();

        leeCorp.kildong = new Jini();
        leeCorp.soon = new Kilsoon();

        leeCorp.java();
        leeCorp.python();
    }
}

class LeeCorp {
    Jini kildong;
    Kilsoon soon;

    public void java() {
        kildong.java();
    }

    public void python() {
        soon.python();
    }
}
