package day15.file;

public class FileTest {
    public static void main(String[] args) {
        FileUtil fu = new FileUtil();

        fu.save("hello world!!!!","test2.txt");

        fu.load("test2.txt");
    }
}
