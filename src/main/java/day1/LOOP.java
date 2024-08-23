package day1;

public class LOOP {
    public static void main(String args[]) {
//        int count = 0;
//        while(count == 0){
//            System.out.println("안녕하세요.");
//            count++;
//        }

        int num = 1;
        System.out.println(num);
        num++;
        System.out.println(num);

        // while문
        int count = 0; // 변수를 만듦과 동시에 값 저장
        while(count < 10) {
            System.out.println("안녕하세요!");
            count++; // count의 값이 1 증가
        }

        // for문
        for(int count2 = 0; count2 < 10; count2++) {
            System.out.println("안녕하세요!");
        }

        for(int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }
}
