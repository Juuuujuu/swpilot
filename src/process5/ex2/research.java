package process5.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class research {
    private String filename;
    private String content;
    String datte;
    public research(researchM rm){
        this.filename = rm.getName();
        this.content= rm.getContent();
    }
    public void printt(){
        try{
            datte = filename.replaceAll("[^0-9]",""); //0-9까지의 숫자를 제외한 나머지 다 없애기
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMddHHmm");
            Date date = inputFormat.parse(datte);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String formattedDate = outputFormat.format(date);

            System.out.printf("->%s %s",formattedDate,content);

        }catch(ParseException e){
            System.err.println("→ java.text.ParseException: Unparseable date: \""+datte+"\" 파일 이름에서 날짜를 확인할 수 없습니다.");
            e.printStackTrace();
        }
    }
}
