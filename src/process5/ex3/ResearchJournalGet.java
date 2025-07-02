package process5.ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResearchJournalGet {
    private List<File> createdFiles = new ArrayList<>();
    public ResearchJournalGet(String route) throws FileNotFoundException, NoDataAvailableException {
        File folder = new File(route);
//        File[] file = forder.listFiles();
        if (!folder.exists() || !folder.isDirectory()) {
            throw new FileNotFoundException("폴더 경로가 잘못되었습니다.");
        }

        File[] files = folder.listFiles();
        // 여기서 파일이 하나도 없으면 예외 발생
        if (files == null || files.length == 0) {
            System.out.println("분석할 파일이 없습니다.");
            throw new NoDataAvailableException("분석할 파일이 없습니다.");
        }

        for(File file : files) {
            String name= null;
            String adr= null;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (line.startsWith("Name.")) {
                        name = line.substring(5).trim();
                    } else if (line.startsWith("ADR.")) {
                        adr = line.substring(4).trim();
                    }
                }
                if(name==null || adr==null) {
                    System.out.println("식물명 또는 주소 정보가 누락되었습니다.");
                    continue;
                }
            String ffname=getJournalname(file);
            File outputFile = new File("C:\\Users\\xuu62\\OneDrive\\Desktop\\swpilot\\src\\process5\\ex3\\researchnew",ffname);
            try(FileOutputStream fos = new FileOutputStream(outputFile, false);
                OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8")){
                    writer.write(name+" - "+adr);
                createdFiles.add(outputFile);
                }

            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }

    }    public List<File> getCreatedFiles() {
        return createdFiles;
    }
    public String getJournalname(File file) {

            String fname = file.getName();
            String datte = fname.replaceAll("[^0-9]",""); //0-9까지의 숫자를 제외한 나머지 다 없애기
//            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMddHHmm");
//            Date date = inputFormat.parse(datte);
//
//            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            String formattedDate = outputFormat.format(date);
            fname = datte+"_Lumino_ADR.txt";
            return fname;
    }
    public String readFileContent(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }
    public class NoDataAvailableException extends Exception {
        public NoDataAvailableException(String message) {
            super(message);
        }
    }
//    public static String readFileContent(String route) throws IOException {
//        String content=null;
//
//        File folder = new File(route);
//        if (!folder.exists() || !folder.isDirectory()) {
//            throw new FileNotFoundException("폴더 경로가 잘못되었습니다.");
//        }
//        File[] files = folder.listFiles();
//        for(File file : files) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null){
//                    content += line+"\n";
//                }
//        }
//
//
//    }
//            return content;
//
//}
}
