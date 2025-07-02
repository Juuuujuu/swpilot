package process5.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class BiodomeForever03 {
    public static void main(String[] args) throws IOException {
        try{
        ResearchJournalGet rjg = new ResearchJournalGet("C:\\Users\\xuu62\\OneDrive\\Desktop\\swpilot\\src\\process5\\ex3\\research");
        // 2. 생성된 output 파일 목록 가져오기
        List<File> createdFiles = rjg.getCreatedFiles();

        // 3. 각각을 읽어서 Journal 객체로 만들고 출력
        for (File file : createdFiles) {
            String content = rjg.readFileContent(file);
            ResearchJournal journal = new ResearchJournal(file.getName(), content);
            journal.printt();
        }

    } catch (FileNotFoundException e) {
        System.out.println("폴더 경로가 잘못되었습니다.");
        e.printStackTrace();
    } catch (
    IOException e) {
        System.out.println("파일 읽기 중 오류 발생");
        e.printStackTrace();
    } catch (ResearchJournalGet.NoDataAvailableException e) {
            throw new RuntimeException(e);
        }
    }
}
