package process1;

import java.util.*;
public class HelloBiodome08 {
    public static StringBuilder checking(StringBuilder a, String[] dictionary){
        int i=0, j,check=0;
        while (true) {
            if(i>=a.length()){
                break;
            }
            for (j = 0; j < dictionary.length; j++) {
                if (dictionary[j].charAt(0) == a.charAt(i) && i+dictionary[j].length()<=a.length()) {
                    String aa=a.substring(i,i+dictionary[j].length());
                    if (aa.equals(dictionary[j])) {
                        if(check!=0){
                            a.insert(i," ");
                            check=0;
                        }
                        else{
                            a.insert(i+dictionary[j].length()," ");
                            i += dictionary[j].length()+1;
                        }
                        break;
                    }
                }
            }
            if(j==dictionary.length){
                if(check==0 && a.charAt(i)!=' ')
                    check=i;
                i++;
            }
        }
        a.deleteCharAt(a.length()-1);
        if(a.charAt(a.length()-1)!='?'){
            a.insert(a.length(),".");
        }
        else{
            a.deleteCharAt(a.length()-2);
        }
        return a;
    }
    public static void main(String[] args) {
        //try{
            StringBuilder a = new StringBuilder(args[0]);
            String[] dictionary = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};
            Arrays.sort(dictionary, Comparator.comparingInt(String::length).reversed());
            a=checking(a, dictionary);
            System.out.println(a);
       // }
//        catch(Exception e){
//            System.out.println("Error");
//        }


    }
}