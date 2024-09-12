package day15.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    // 파일 저장
    public void save(String content, String fileName) {
        Path filePath = Paths.get(fileName);

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("파일 저장 완료 : " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일 읽기
    public String load(String filename) {
        Path filePath = Paths.get(filename);

        try {
            // 파일에서 문자열 읽기
            String content = Files.readString(filePath);
            return content;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}