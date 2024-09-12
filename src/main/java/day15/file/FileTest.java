package day15.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
    public static void main(String[] args) {
        Path filePath = Paths.get("test.txt");

        try {
            // 파일에 문자열 읽기
            String content = Files.readString(filePath);
            System.out.println("파일 내용 : " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
