package day7.duck;

// 둘 이상의 부모를 상속받을 수 없음.
// 객체가 많아지고 상속 관계가 복잡해질수록 중복 해결이 어려워짐.
// 상속의 한계.
// 상속은 잘못사용하면 큰일남.
public class 아수라오리 extends 오리 {
    public void 헤엄치다() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}