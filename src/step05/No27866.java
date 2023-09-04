package step05;

import java.util.Scanner;

/* 27866번 : 문자와 문자열
* 단어 S와 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성
* 풀이 방법 : 입력 -> Scanner 사용
* */
public class No27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int index = sc.nextInt();

        sc.close();

        System.out.println(S.charAt(index - 1));
    }
}
