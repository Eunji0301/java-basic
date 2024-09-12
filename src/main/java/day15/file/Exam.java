package day15.file;
// 다음 코드가 오류없이 진행되도록 해주세요. 오류만 안나면 됩니다.
public class Exam {
    public static void main(String[] args) {
        DataStore ds = new DataStore();

        // // 정수 계열
        byte b = 0; // 1바이트
        ds.save(b);

        short s = 2; // 2바이트
        ds.save(s);

        int i = 3; // 4바이트
        ds.save(i);

        long l = 4; // 8바이트
        ds.save(l);

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        ds.save(f);

        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트
        ds.save(d);
        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트
        ds.save(bl);

        // 객체 계열
        Person p1 = new Person();
        ds.save(p1);

        Apple a1 = new Apple();
        ds.save(a1);

        String str = "hello";
        ds.save(str);

    }
}

class DataStore {
    public void save(byte b) {}

    public void save(short s) {}

    public void save(int i) {}

    public void save(long l) {}

    public void save(float f) {}

    public void save(double d) {}

    public void save(boolean b) {}

    public void save(Person p1) {}

    public void save(Apple a1) {}

    public void save(String s) {}
}

class Person {}

class Apple {}