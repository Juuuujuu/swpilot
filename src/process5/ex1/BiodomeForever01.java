package process5.ex1;

import java.io.*;

public class BiodomeForever01 {
    static String f_name;

    public static void researchJournal(FileInputStream fis){
        try{
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line=br.readLine())!=null) {
            System.out.println(line);
        }
        }
        catch (IOException e) {
                throw new RuntimeException(e);}
    }
    public static void researchManagement() {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream("./src/process5/ex1/"+f_name);
                researchJournal(fis);

            } catch (FileNotFoundException e) {
                System.out.println("존재하지 않는 파일입니다. 파일 이름을 다시 확인해주세요.");

            } finally {
                try {
                    if (fis != null) {
                        fis.close(); // 파일 닫기
                    }
                } catch (IOException e) {
                    System.err.println("스트림 닫기 오류: " + e.getMessage());
                }
            }
        }
    public static void main(String[] args) {
        f_name = args[0];
        researchManagement();
    }

}
