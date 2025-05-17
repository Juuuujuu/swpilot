package process2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class RoadToBiodome06 {
    public static double mid=0;
    public static double mean=0;
    public static int[] finput1,finput2;
    public static void main(String[] args) {
        String[] a = args;
        String inputt = "";
        for (int i = 0; i < a.length; i++) {
            inputt = inputt.concat(a[i]);
        }
        StringTokenizer n = new StringTokenizer(inputt, "[, ");
        finput1 = new int[n.countTokens()];
        int i = 0;
        int j=0;
        while (n.hasMoreTokens()) {
            String k = n.nextToken();
            if (k.substring(k.length() - 1).equals("]")) {
                if(j>0){
                    finput2[j]=Integer.parseInt(k.substring(0,k.length()-1));
                }
                else{
                finput1[i] = Integer.parseInt(k.substring(0, k.length() - 1));}


            } else {
                if(j>0){
                    finput2[j]=Integer.parseInt(k);
                    j++;
                }
                else{
                finput1[i] = Integer.parseInt(k);
                i++;}

            }
        }
        Arrays.sort(finput1);
        Arrays.sort(finput2);

    }
    public static void meann(){
        //mean/=finput.length;
    }
    public static void midd(){
        int i=0;
        int j=0;
        int n=finput1.length;
        int m=finput2.length;
        if((n+m)%2==1){
            //이진탐색
        }
    }

}
