package process5.ex2;

import java.io.*;

public class researchM {
    private String content="";
    private String name;
    public researchM(String fname){
        this.name=fname;
        contentt();
    }
    public String getName(){
        return name;
    }
    public String getContent(){
        return content;
    }
    public String contentt(){
        FileInputStream fis=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        try{
            fis = new FileInputStream("./src/process5/ex2/"+name);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line;
            while((line=br.readLine())!=null) {
                content+=line+" ";
            }
        }catch(FileNotFoundException e){
            System.err.printf("→ java.io.FileNotFoundException: %s (No such file or directory) 존재하지 않는 파일입니다. 파일 이름을 다시 확인해주세요.\n",name);
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(SecurityException e){
            e.printStackTrace();
        }finally{
            try {
                if (fis != null) {
                    fis.close(); // 파일 닫기
                }
                if(br!=null) br.close();
                if(isr!=null) isr.close();
            } catch (IOException e) {
                System.err.println("스트림 닫기 오류: " + e.getMessage());
            }
        }
        return content;
    }
}
