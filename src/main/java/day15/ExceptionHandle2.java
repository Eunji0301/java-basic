package day15;

public class ExceptionHandle2 {
    public static void main(String[] args) {
        test(1);
    }

    public static void test(int flag) {
        // 예외 직접 발생시키기 -> 테스트 용도
        // 어떤 상황에서는 프로그램을 진행시키는것보다 강제로 종료시키고 바로 고치는게 나을 수 있다.
        if (flag == 1) {
            try {
                throw new Exception(); // unhandle exception, checked exception => 무조건 try-catch 예외처리 강제
            } catch (Exception e) {

            }
        } else if (flag == 2) {
            throw new RuntimeException(); // runtime exception, unchecked exception => try-catch 예외처리 안해도 됨
        }

        System.out.println("hihi");
    }
}
