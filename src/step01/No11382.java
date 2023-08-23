package step01;

import java.util.Scanner;

/*
* 11382번 : 꼬마 정민
* 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
* 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
* */
public class No11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();   // 입력값의 크기 때문에 자료형은 long으로 해야한다.
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);

        /*
        * int는 4byte, 값의 범위는 -2^31 ~ 2^31
        * long은 8byte, 값의 범위는 -2^63 ~ 2^63
        * */
    }
}