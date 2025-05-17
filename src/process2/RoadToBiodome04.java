package process2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        String[] input=args; //명령행 인자 값
        String inputt=""; //띄어쓰기 없앤 명령행 인자
        for(int i=0;i<input.length;i++){
            inputt=inputt.concat(input[i]);
        }
        StringTokenizer inputtok =new StringTokenizer(inputt,", []"); //토크나이저로 나눔
        int[] finput = new int[inputtok.countTokens()]; //숫자만 넣는 배열
        double mid=0;
        int i=0;
        double avg=0;
        while(inputtok.hasMoreTokens()){
            finput[i]=Integer.parseInt(inputtok.nextToken());
            avg+=(double) finput[i];
            for(int j=0;j<=i;j++){
                for(int k=j+1;k<=i;k++){
                    if(finput[j]>finput[k]){
                        int temp=finput[j];
                        finput[j]=finput[k];
                        finput[k]=temp;
                    }
                }
//                if(j!=i-1){
//                    if(finput[i]>finput[j] && finput[i]<finput[j+1]) {
//                        int ivalue=finput[i];
//                        for(int k=i;k>j+1;k--){
//                            finput[k]=finput[k-1];
//                        }
//                        finput[j+1]=ivalue;
//                        break;
//                    }
//                }
//                else{
//                    if(finput[i]<finput[j]){
//                        int ivalue=finput[i];
//                        finput[i]=finput[j];
//                        finput[j]=ivalue;
//                    }
//                }

            }
            i++;
        }
        if(finput.length%2==0){
            mid=(double)(finput[finput.length/2]+finput[finput.length/2-1])/(double)2;
            System.out.println("평균값 : "+avg/(double)finput.length+", 중앙값 : "+mid);
        }
        else{
            System.out.println("평균값 : "+avg/(double)finput.length+", 중앙값 : "+finput[finput.length/2]);
        }


    }
}
