package process2;

import java.util.StringTokenizer;

public class RoadToBiodome05 {
    public static int[] finput;
    public static void main(String[] args) {
        String[] a = args;
        String inputt = "";
        for(int i = 0; i < a.length; i++){
            inputt=inputt.concat(a[i]);
        }
        StringTokenizer n = new StringTokenizer(inputt,"[, ");
        finput = new int[n.countTokens()];
        int i=0;
        while(n.hasMoreTokens()){
            String k=n.nextToken();
            if(k.substring(k.length()-1).equals("]")){
                finput[i]=Integer.parseInt(k.substring(0,k.length()-1));

            }
            else{
                finput[i]=Integer.parseInt(k);
            }
                i++;
        }
        quicksort(finput,0,finput.length-1);
        System.out.print("[");
        for(int k=0;k<finput.length;k++){
            System.out.print(finput[k]+",");
        }
        System.out.println("\b]");
    }
    public static void quicksort(int[] a, int i, int j){
        int prt=partition(a,i,j);
        if(i<prt-1){
            quicksort(a,i,prt-1);
        }
        if(j>prt){
            quicksort(a,prt,j);
        }
    }
    public static int partition(int[] a, int i, int j){
        int pivot = a[(i+j)/2];
        while(i<=j){
            while(a[i]<pivot){ i++;}
            while(a[j]>pivot){j--;}
            if(i<=j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
