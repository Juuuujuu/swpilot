package process5.ex3;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResearchJournal {
    public String fname;
    public String fcontent;
    public ResearchJournal(String Filename, String Content) {
        this.fname = Filename;
        this.fcontent =Content;
    }
    public String getFname() {
        return fname;
    }
    public String getFcontent() {
        return fcontent;
    }

    public void printt() {
//        File[] file = forder.listFiles();
        System.out.println(fcontent);
    }
}
