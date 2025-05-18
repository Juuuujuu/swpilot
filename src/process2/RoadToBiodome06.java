package process2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class RoadToBiodome06 {
    public static double mid=0;
    public static double mean=0;
    public static int[] finput1;
    public static int[] finput2;
    public static int n=0;
    public static int m=0;
    public static void main(String[] args) {
        String[] a = args;
        String inputt = "";
        for (int i = 0; i < a.length; i++) {
            inputt = inputt.concat(a[i]);
        }
        StringTokenizer t = new StringTokenizer(inputt, "[, ");
        finput1 = new int[t.countTokens()];
        finput2 = new int[t.countTokens()];
        int i = 0;
        int j=0;
        while (t.hasMoreTokens()) {
            String k = t.nextToken();
            if (k.substring(k.length() - 1).equals("]")) {
                if(j>0){
                    finput2[m]=Integer.parseInt(k.substring(0,k.length()-1));
                    m++;
                }
                else{
                finput1[n] = Integer.parseInt(k.substring(0, k.length() - 1));
                n++;
                j++;}


            } else {
                if(j>0){
                    finput2[m]=Integer.parseInt(k);
                    m++;

                }
                else{
                finput1[n] = Integer.parseInt(k);
                    n++;}

            }
        }
        Arrays.sort(finput1,0,n);
        Arrays.sort(finput2,0,m);
        meann();
        mid=midd();
        System.out.printf("Mean : %.1f, Median : %.1f", mean, mid);

    }
    public static void meann(){
        for(int i=0;i<n;i++){
            mean+=finput1[i];
            //System.out.println(finput1[i]);
        }
        for(int i=0;i<m;i++) {
            mean += finput2[i];
            //System.out.println(finput2[i]);
        }

        mean=mean/(double)(m+n);
    }
    public static double midd(){

        int[] A = finput1;  // 첫 번째 정렬된 배열
        int[] B = finput2;  // 두 번째 정렬된 배열

        // 항상 A가 더 짧은 배열이 되도록 설정
        if (A.length > B.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }
        // 왼쪽 절반에 들어갈 총 원소 수 계산
        // 홀수면 한쪽이 하나 더 많고, 짝수면 양쪽이 같음
        int totalLeft = (m + n + 1) / 2;

        int low = 0, high = n;  //A로 탐색

        while (low <= high) {
            int i = (low + high) / 2;     // A에서 왼쪽 파티션의 크기
            int j = totalLeft - i;        // B에서 왼쪽 파티션의 크기

            // A의 왼쪽 최대값 (i가 0이면 아무것도 없으므로 MIN_VALUE)
            int Aleft = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
            // A의 오른쪽 최소값 (i가 끝이면 아무것도 없으므로 MAX_VALUE)
            int Aright = (i == n) ? Integer.MAX_VALUE : A[i];
            int Bleft = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
            int Bright = (j == m) ? Integer.MAX_VALUE : B[j];

            // 조건을 만족하면 올바른 파티션을 찾은 것
            if (Aleft <= Bright && Bleft <= Aright) {
                // 전체 길이가 홀수면 max(Aleft, Bleft)가 중앙값
                if ((m + n) % 2 == 1) {
                    mid = Math.max(Aleft, Bleft);
                }
                // 전체 길이가 짝수면 중간 두 값의 평균
                else {
                   mid = (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                }
                return mid;
            }
            // Aleft가 Bright보다 크면, i를 왼쪽으로 옮겨야 함
            else if (Aleft > Bright) {
                high = i - 1;
            }
            // Bleft가 Aright보다 크면, i를 오른쪽으로 옮겨야 함
            else {
                low = i + 1;
            }
        }
        return 0;
    }

}
