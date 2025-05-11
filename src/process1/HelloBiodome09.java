package process1;

public class HelloBiodome09 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            if(n<3||n>100)
                System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            else{
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int j = 1; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
        }
    }
}
