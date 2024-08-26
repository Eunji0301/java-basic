package day2;

public class exam7 {
    public static void main(String args[]) {
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < 3 ; i++) {
            System.out.println();
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
