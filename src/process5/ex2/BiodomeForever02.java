package process5.ex2;

import java.text.ParseException;

public class BiodomeForever02 {
    public static void main(String[] args) {
        try {
            String fname = args[0];
            //char datte[] = new char[8];
            //fname.getChars(0,11,datte,1);
            researchM rm = new researchM(fname);
            research r=new research(rm);
            r.printt();

        } catch (NullPointerException e) {

        }
//        catch(ParseException e){
//
//        }
//        finally{
//
//        }

    }
}
