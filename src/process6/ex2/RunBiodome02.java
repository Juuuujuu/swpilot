package process6.ex2;
import java.io.*;
import java.util.Scanner;

public class RunBiodome02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("바이오도메 에너지 관리 시스템에 오신 것을 환영합니다.");
        System.out.println("1.전체 에너지 조회하기");
        System.out.println("2.특정 구역 에너지 할당하기");
        System.out.println("3.구역별 에너지 조회하기");
        System.out.println("4.종료하기");
        EnergyDistributor ed = new EnergyDistributor();
        EnergyDistributor.EnergyAllocator allocator = ed.allocation();
        while(true){
            System.out.println();
            System.out.print("메뉴를 선택하세요:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    ed.search();
                    break;
                case 2:
                    System.out.print("할당하려는 구역 이름을 입력하세요: ");
                    String nname=sc.next();
                    System.out.print("할당하려는 에너지량을 입력하세요: ");
                    int ee = sc.nextInt();
                    allocator.allocate(nname, ee);
                    break;

                case 3:
                    ed.find();
                    break;
                case 4:
                    System.out.println("->  바이오도메 에너지 관리 시스템을 종료합니다. 감사합니다.");
                    break;
                default:
                    System.out.println("→ 1번에서 4번 메뉴를 선택해주세요.");
                }

            if(choice==4){
                break;
            }
        }
    }
}
