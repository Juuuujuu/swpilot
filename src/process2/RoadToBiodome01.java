
package process2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RoadToBiodome01 {
    public static void finding(int[] finput){
        int i,j;
        for (i=0;i<finput.length;i++) {
            for(j=i+1;j<finput.length;j++) {
                if(finput[i]==finput[j]) {
                    finput[j]=-1;
                    break;
                }
            }
            if(j==finput.length&&finput[i]!=-1){
                System.out.println(finput[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] input=args; //명령행 인자 값
        String inputt=""; //띄어쓰기 없앤 명령행 인자
        for(int i=0;i<input.length;i++){
            inputt=inputt.concat(input[i]);
        }
        StringTokenizer inputtok =new StringTokenizer(inputt,", []"); //토크나이저로 없앰
        int[] finput = new int[inputtok.countTokens()]; //숫자만 넣는 배열
        int i=0;
        while(inputtok.hasMoreTokens()){
            finput[i]=Integer.parseInt(inputtok.nextToken());
            if(finput[i]<0 || finput[i]>1000){
                System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                return;
            }
            i++;
        }
        finding(finput); //중복되지 않는 값 찾고 출력하는 메서드


    }
}
