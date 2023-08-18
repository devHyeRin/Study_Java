package step01;

import java.util.Scanner;

public class No1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

         System.out.println(a+b);

        sc.close();    // 스캐너는 항상 close()로 닫기 !
    }
}
