package process1;

public class HelloBiodome01 {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("다시 입력하세요");
            return;
        }
        String name = args[0];
        System.out.println(name+"님 안녕하세용");

    }
}