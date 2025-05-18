# 시간복잡도 

입력값과 연산 수행 시간의 상관관계를 나타내는 척도
알고리즘의 성능을 설명하는 것이다. 프로세스가 수행해야하는 연산을 수치화한 것
실제 전체 실행시간보다 명령문의 실행시간을 계산하여 나타냄 


### 표기법

best case -> Big-Ω
average case -> Big-θ
worst case -> Big-O


### 필요성
시간복잡도 필요성 : 다양한 풀이법중에 어느 것이 더 효율적인지 판별하기 위해서 필요하다.

### 문제 1: O(n²)
```
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
        StringTokenizer inputtok =new StringTokenizer(inputt,", []"); //토크나이저로 나눔
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
```
    finding 메서드에서 바깥 for문 0~finput.length-1동안 반복 -> n (=finput.length)
                     안쪽 for문 i+1~finput.length동안 반복
    총 반복 횟수 : (n-1)+(n-2)+(n-3)+···+1 -> O(n²)

### 문제 2: O(n²)
```
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
```
    main 함수 내에서 첫번째 for문 0~A.length-1동안 반복 -> n (=A.length)
    두번째 이중for문에서 A.length*A[i].length()만큼 반복 ->  O(n)
    세번째 check == true -> for문 0~A.length-1동안 반복 -> n
                    false -> while문
    시간복잡도 => O(n)

### 시간복잡도를 줄일 수 있는 방법
    ① 이중 for문에서 병목현상이 생기며, 이는 hashmap을 사용하여 O(n)으로 고칠 수 있다.

    [finding 메서드 내에서의 수정]
    HashMap<Integer, Integer> countMap = new HashMap<>();
    // 각 숫자의 등장 횟수 세기
        for (int num : finput) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 한 번만 등장한 숫자 출력
        for (int num : finput) {
            if (countMap.get(num) == 1) {
                System.out.println(num);
            }
        }

    ② StringBuilder를 사용하여 더 간단한 코드로 만든다
    [StringBuilder를 사용한 간략한 코드]
     StringBuilder original = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            original.append(args[i]);
            if (i != args.length - 1) {
                original.append(" ");
            }
        }

        String message = original.toString();
        String reversed = new StringBuilder(message).reverse().toString();

        if (message.equals(reversed)) {
            System.out.println(message);
        } else {
            System.out.println(reversed);
        }
    }