package day2;

public class Array {
    public static void main(String args[]) {
        // 변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        // 1. 변수명이 많아져서 힘듦. -> 변수명을 한 개만 쓰면 됨.
        // 2. 변수가 많아서 다 사용하기 힘듦. -> 반복문을 사용하면 됨.

        // 결론 : 배열을 사용하면 됨.

        int[] arr = {10, 20, 30, 40, 50};
        // 꾸러미        넣을 값들
        System.out.println(arr[3]);
        System.out.println(arr[0]);

        System.out.println(arr[1]);
        arr[1] = 100; // 배열의 특정 위치의 값을 새로운 값으로 대입 가능
        System.out.println(arr[1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 숫자 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        // 배열에 저장하고 출력.

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(arr2[4]);
        for (int i = 0; i < arr2.length; i++) {
            //                 10
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // 배열의 길이 정보 확인 <- 중요한 정보
        System.out.println(arr2.length);

        // 내가 저장할 값이 몇개인지 모를 때, 개수를 알아도 구체적인 값을 모를 때
        // 비어있는 배열을 만들어 놓고 나중에 값을 저장할 수도 있어야 함.

        // 10개짜리 비어있는 배열을 만들기
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr4 = new int[10];
        System.out.println(arr3.length);
        System.out.println(arr4.length);

        arr4[4] = 10;

    }
}