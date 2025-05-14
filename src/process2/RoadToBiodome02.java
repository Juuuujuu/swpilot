package process2;

public class RoadToBiodome02 {
    static int p =0;
    static int count=0;
    static boolean check = true;
    public static char[] bonuspush(char k, char[] stackk){
        if(p>count/2 && check == true)
        {
            if(stackk[count-p-1]!=k){
                check = false;
            }
        }
        stackk[p++]=k;
        return stackk;
    }
    public static char[] push(char k,char[] stackk){
        stackk[p++]=k;
        return stackk;
    }
    public static char pop(char[] stackk){
        char k=stackk[--p];
        return k;
    }
    public static void main(String[] args) {
        String[] A = args;
        for(int i=0;i<args.length;i++){ //count에 원소 개수 구하기
            count+=args[i].length();
        }
        count+=args.length-1; //공백 개수 추가
        if(count<2){
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }
        char[] stackk = new char[count]; //스택 길이 지정해서 선언
        for(int i=0;i<A.length;i++){ //push
            for(int j=0;j<A[i].length();j++){
                stackk=bonuspush(A[i].charAt(j),stackk); //보너스문제 push
               // stackk=push(A[i].charAt(j),stackk); //기본문제 문제 push
            }
            if(i!=A.length-1)
                push(' ',stackk);
        }
        if(check == true){
            for(int i=0;i<args.length;i++){ //count에 원소 개수 구하기
                System.out.print(args[i]+" ");
            }
            System.out.print("\b");
        }
        else{
        while(p>0){ //pop
            System.out.print(pop(stackk));
        }}
    }
}
