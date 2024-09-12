package day15.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
    public static void main(String[] args) {
        String content = "이것은 파일에 쓰여질 내용입니다.";
        Path filePath = Paths.get("example.txt");

        try {
            // 파일에 문자열 쓰기
            Files.write(filePath,content.getBytes());
            System.out.println("파일 작성 완료 : "+filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
