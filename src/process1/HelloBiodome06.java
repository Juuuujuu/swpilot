package process1;

public class HelloBiodome06 {
    static public void main(String[] args) {
        try{
            String a1=args[0];
            String a2=args[1];
            if(a1.length()!=a2.length()){
                System.out.println("일치하지 않습니다.");
            }
            else{
                int i=0;
                while(i<a1.length()){
                    if(a1.charAt(i)!=a2.charAt(i)){
                        break;
                    }
                    i++;
                }
                if(i==a1.length()){
                    System.out.println("일치합니다.");
                }
                else{
                    System.out.println("일치하지 않습니다.");
                }
            }
        } catch (Exception e) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
        }
    }
}
