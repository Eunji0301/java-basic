package day4.exam4;

public class Test4 {
    public void printEven(int n) {
        isEven(n);
    }

    public void isEven(int num) {
        for(int i = 1 ; i < num; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}