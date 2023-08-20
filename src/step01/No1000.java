package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No1000 {
    public static void main(String[] args) throws IOException {
        // 1. Scanner 사용
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

         System.out.println(a+b);

        sc.close();    // 스캐너는 항상 close()로 닫기 !

        /* 2. Buffer 사용
        * BufferedReader : 문자열 받기 -> readLine() : 한 행 -> 이걸 사용 / read() : 한 문자
        *
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");    // throws 예외 처리 필요
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(c+d);
    }
}
