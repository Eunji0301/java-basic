package day2;

public class DoubleLoop {
    public static void main(String args[]) {
//        int num = 2;
        for(int i = 2; i <= 9; i++) {
            System.out.println("==========");
            System.out.println(i + "단");
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }

        }
    }
}
