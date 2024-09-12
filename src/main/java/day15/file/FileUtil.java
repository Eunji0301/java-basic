package day15.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    public void save(String content, String fileName) {
        Path filePath = Paths.get(fileName);

        try {
            // 파일에 문자열 읽기
            Files.write(filePath, content.getBytes());
            System.out.println("파일 작성 완료 : " + filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filename) {
        Path filePath = Paths.get(filename);

        try {
            String content = Files.readString(filePath);
            System.out.println("파일내용 : " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}