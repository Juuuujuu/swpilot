package process6;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunBiodome01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("멤버 리스트를 입력하세요:");
        String llist = sc.nextLine();
        llist=llist.replaceAll("\\[|\\]","");
        List<String> flist=Arrays.stream(llist.split(", ")).filter(s->s.startsWith("신입-")).map(s->s.substring(3)+"님 환영합니다").collect(Collectors.toList());
        System.out.println("->");
        System.out.println(flist);
    }
}
